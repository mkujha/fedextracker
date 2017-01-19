package com.demo;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.demo.client.FedexTrackerClient;
import com.demo.domain.WriteEventLog;
import com.demo.fedex.domain.Address;
import com.demo.fedex.domain.ClientDetail;
import com.demo.fedex.domain.CompletedTrackDetail;
import com.demo.fedex.domain.CustomerExceptionRequestDetail;
import com.demo.fedex.domain.DeliveryOptionEligibilityDetail;
import com.demo.fedex.domain.Money;
import com.demo.fedex.domain.Notification;
import com.demo.fedex.domain.NotificationSeverityType;
import com.demo.fedex.domain.TrackDetail;
import com.demo.fedex.domain.TrackEvent;
import com.demo.fedex.domain.TrackOtherIdentifierDetail;
import com.demo.fedex.domain.TrackReply;
import com.demo.fedex.domain.TrackStatusAncillaryDetail;
import com.demo.fedex.domain.TrackStatusDetail;
import com.demo.fedex.domain.Weight;
import com.demo.util.DBConnector;

@Component
public class ScheduledTasks {

	@Autowired
	FedexTrackerClient fedexTrackerClient;
	@Autowired
	@Resource(name = "demoDao")
	private DBConnector dbConnector;

	private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime() throws SQLException {
		log.info("The time is now {}", dateFormat.format(new Date()));
		WriteEventLog eventLog = dbConnector.getWriteEventLog();		
		TrackReply reply = fedexTrackerClient.trackFedEx(fedexTrackerClient.createRequest(eventLog));
		log.info(" DB value" + reply);
		//
		if (printNotifications(reply.getNotifications())) {
			printCompletedTrackDetail(reply.getCompletedTrackDetails());
		}
		if (reply.getCompletedTrackDetails() != null) {
			printCompletedTrackDetail(reply.getCompletedTrackDetails());
		}
		if (isResponseOk(reply.getHighestSeverity())) // check if the call was
														// successful
		{
			System.out.println("--Track Reply--");
		}
	}

	private void printCompletedTrackDetail(List<CompletedTrackDetail> ctd) {
		for (int i = 0; i < ctd.size(); i++) { // package detail information
			boolean cont = true;
			System.out.println("--Completed Tracking Detail--");
			if (ctd.get(i).getNotifications() != null) {
				System.out.println("  Completed Track Detail Notifications--");
				cont = printNotifications(ctd.get(i).getNotifications());
				System.out.println("  Completed Track Detail Notifications--");
			}
			if(cont){
				print("DuplicateWayBill", ctd.get(i).isDuplicateWaybill());
				print("Track Details Count", ctd.get(i).getTrackDetailsCount());
				if(ctd.get(i).isMoreData()){
					System.out.println("  Additional package data not yet retrieved");
					if(ctd.get(i).getPagingToken()!=null){
						print("  Paging Token", ctd.get(i).getPagingToken());
					}
				}
				printTrackDetail(ctd.get(i).getTrackDetails());				
			}
			System.out.println("--Completed Tracking Detail--");
			System.out.println();
		}
	}

	private void printTrackDetail(List<TrackDetail> td) {
		for (int i = 0; i < td.size(); i++) {
			boolean cont = true;
			System.out.println("--Track Details--");
			if (td.get(i).getNotification() != null) {
				System.out.println("  Track Detail Notification--");
				cont = printNotifications(td.get(i).getNotification());
				System.out.println("  Track Detail Notification--");
			}
			if (cont) {
				print("Tracking Number", td.get(i).getTrackingNumber());
				print("Carrier code", td.get(i).getCarrierCode());
				if (td.get(i).getService() != null) {
					if (td.get(i).getService().getType() != null && td.get(i).getService().getDescription() != null) {
						print("Service", td.get(i).getService().getType());
						print("Description", td.get(i).getService().getDescription());
					}
				}

				if (td.get(i).getStatusDetail() != null) {
					System.out.println("--Status Details--");
					printStatusDetail(td.get(i).getStatusDetail());
					System.out.println("--Status Details--");
				}
				if (td.get(i).getOriginLocationAddress() != null) {
					System.out.println("--Origin Location--");
					print(td.get(i).getOriginLocationAddress());
					System.out.println("--Origin Location--");
				}
				if (td.get(i).getDestinationAddress() != null) {
					System.out.println("--Destination Location--");
					printDestinationInformation(td.get(i));
					System.out.println("--Destination Location--");
				}
				if (td.get(i).getActualDeliveryAddress() != null) {
					System.out.println("--Delivery Address--");
					print(td.get(i).getActualDeliveryAddress());
					System.out.println("--Delivery Address--");
				}

				if (td.get(i).getDeliveryAttempts().shortValue() > 0) {
					System.out.println("--Delivery Information--");
					printDeliveryInformation(td.get(i));
					System.out.println("--Delivery Information--");
				}

				if (td.get(i).getEvents() != null) {
					System.out.println("--Tracking Events--");
					printTrackEvents(td.get(i).getEvents());
					System.out.println("--Tracking Events--");
				}
				System.out.println("--Track Details--");
				System.out.println();
			}
		}
	}

	private void printCustomerExceptionRequests(List<CustomerExceptionRequestDetail> exceptions) {
		if (exceptions != null) {
			for (int i = 0; i < exceptions.size(); i++) {
				CustomerExceptionRequestDetail exception = exceptions.get(i);
				print("Exception Id", exception.getId());
				print("Excpetion Status Code", exception.getStatusCode());
				print("Excpetion Status Description", exception.getStatusDescription());
				if (exception.getCreateTime() != null) {
					System.out.println("  Customer Exception Date--");
					print(exception.getCreateTime());
					System.out.println("  Customer Exception Date--");
				}
			}
		}
	}

	private void printTrackEvents(List<TrackEvent> events) {
		if (events != null) {
			for (int i = 0; i < events.size(); i++) {
				TrackEvent event = events.get(i);
				print("Event no. ", i);
				print(event.getTimestamp());
				if (event.getEventType() != null) {
					print("Type", event.getEventType());
				}
				print("Station Id", event.getStationId());
				print("Exception Code", event.getStatusExceptionCode());
				print("", event.getStatusExceptionDescription());
				print("Description", event.getEventDescription());
				if (event.getAddress() != null) {
					System.out.println("  Event Address--");
					print(event.getAddress());
					System.out.println("  Event Address--");
				}
				System.out.println();
			}
		}
	}

	private void printStatusDetail(TrackStatusDetail tsd) {
		if (tsd != null) {
			print(tsd.getCreationTime());
			print("Code", tsd.getCode());
			if (tsd.getLocation() != null) {
				System.out.println("--Location Address Detail--");
				print(tsd.getLocation());
				System.out.println("--Location Address Detail--");
			}
			if (tsd.getAncillaryDetails() != null) {
				System.out.println("--Ancillary Details--");
				printAncillaryDetails(tsd.getAncillaryDetails());
				System.out.println("--Ancillary Details--");
			}
		}
	}

	private void printAncillaryDetails(List<TrackStatusAncillaryDetail> details) {
		if (details != null) {
			for (int i = 0; i < details.size(); i++) {
				if (details.get(i) != null) {
					if (details.get(i).getReason() != null && details.get(i).getReasonDescription() != null) {
						print(details.get(i).getReason(), details.get(i).getReasonDescription());
					}
				}
			}
		}
	}

	private void printDestinationInformation(TrackDetail td) {
		if (td.getDestinationAddress() != null) {
			print(td.getDestinationAddress());
		}
		print("Destination Type", td.getDestinationLocationType());
		print("Service Area", td.getDestinationServiceArea());
		print("Service Area Description", td.getDestinationServiceAreaDescription());
		print("Station Id", td.getDestinationStationId());
		print("Destination Timezone Offset", td.getDestinationLocationTimeZoneOffset());
	}

	private void printDeliveryOptionEligibility(List<DeliveryOptionEligibilityDetail> options) {
		for (int i = 0; i < options.size(); i++) {
			DeliveryOptionEligibilityDetail option = options.get(i);
			if (option != null) {
				print(option.getOption(), option.getEligibility());
			}
		}
	}

	private void printDeliveryInformation(TrackDetail td) {
		System.out.println("Delivery attempts: " + td.getDeliveryAttempts());
		print("Delivery Location", td.getDeliveryLocationDescription());
		print("Delivery Signature", td.getDeliverySignatureName());
		if (td.getDeliveryOptionEligibilityDetails() != null) {
			System.out.println("Delivery Options");
			printDeliveryOptionEligibility(td.getDeliveryOptionEligibilityDetails());
		}
	}

	private void printTrackOtherIdentifierDetail(List<TrackOtherIdentifierDetail> id) {
		if (id != null) {
			for (int i = 0; i < id.size(); i++) {
				if (id.get(i).getPackageIdentifier() != null) {
					print(id.get(i).getPackageIdentifier().getType(), id.get(i).getPackageIdentifier().getValue());
				}
			}
		}
	}

	private void printTime(Calendar calendar) {
		if (calendar != null) {
			int month = calendar.get(Calendar.MONTH) + 1;
			int day = calendar.get(Calendar.DAY_OF_MONTH);
			int year = calendar.get(Calendar.YEAR);
			String date = new String(year + "-" + month + "-" + day);
			print("Date", date);
			printDOW(calendar);
		}
	}

	private void printAddress(Address address) {
		print("__________________________________");
		if (address.getStreetLines() != null) {
			List<String> streetLines = address.getStreetLines();
			for (int i = 0; i < streetLines.size(); i++) {
				if (streetLines.get(i) != null) {
					print("Street", streetLines.get(i));

				}
			}
		}
		print("City", address.getCity());
		print("State or Province Code", address.getStateOrProvinceCode());
		print("Postal Code", address.getPostalCode());
		print("Country Code", address.getCountryCode());
		if (address.isResidential()) {
			print("Address Type", "Residential");
		} else {
			print("Address Type", "Commercial");
		}

		print("__________________________________");
	}

	private void printDOW(Calendar calendar) {
		if (calendar != null) {
			String day;
			switch (calendar.get(Calendar.DAY_OF_WEEK)) {
			case 1:
				day = "Sunday";
				break;
			case 2:
				day = "Monday";
				break;
			case 3:
				day = "Tuesday";
				break;
			case 4:
				day = "Wedensday";
				break;
			case 5:
				day = "Thursday";
				break;
			case 6:
				day = "Friday";
				break;
			case 7:
				day = "Saturday";
				break;
			default:
				day = "Invalid Date";
				break;
			}
			print("Day of Week", day);
		}
	}

	private boolean isResponseOk(NotificationSeverityType notificationSeverityType) {
		if (notificationSeverityType == null) {
			return false;
		}
		if (notificationSeverityType.equals(NotificationSeverityType.WARNING)
				|| notificationSeverityType.equals(NotificationSeverityType.NOTE)
				|| notificationSeverityType.equals(NotificationSeverityType.SUCCESS)) {
			return true;
		}
		return false;
	}

	private ClientDetail createClientDetail() {
		ClientDetail clientDetail = new ClientDetail();
		String accountNumber = System.getProperty("accountNumber");
		String meterNumber = System.getProperty("meterNumber");

		//
		// See if the accountNumber and meterNumber properties are set,
		// if set use those values, otherwise default them to "XXX"
		//
		if (accountNumber == null) {
			accountNumber = "510087666"; // Replace "XXX" with clients account
											// number
		}
		if (meterNumber == null) {
			meterNumber = "118775182"; // Replace "XXX" with clients meter
										// number
		}
		clientDetail.setAccountNumber(accountNumber);
		clientDetail.setMeterNumber(meterNumber);
		return clientDetail;
	}

	private void printMoney(Money money) {
		if (money != null) {
			String currency = money.getCurrency();
			String amount = money.getAmount().toString();
			print("Charge", currency + " " + amount);
		}
	}

	private boolean printNotifications(Object n) {
		boolean cont = true;
		if (n != null) {
			List<Notification> notifications = null;
			Notification notification = null;
			if (n instanceof List) {
				notifications = (List<Notification>) n;
				if (notifications == null || notifications.size() == 0) {
					System.out.println("  No notifications returned");
				}
				for (int i = 0; i < notifications.size(); i++) {
					printNotification(notifications.get(i));
					if (!success(notifications.get(i))) {
						cont = false;
					}
				}
			} else if (n instanceof Notification) {
				notification = (Notification) n;
				printNotification(notification);
				if (!success(notification)) {
					cont = false;
				}
			}

		}
		return cont;
	}

	private void printNotification(Notification notification) {
		if (notification == null) {
			System.out.println("null");
		}
		NotificationSeverityType nst = notification.getSeverity();

		print("  Severity", (nst == null ? "null" : nst.value()));
		print("  Code", notification.getCode());
		print("  Message", notification.getMessage());
		print("  Source", notification.getSource());
	}

	private boolean success(Notification notification) {
		Boolean cont = true;
		if (notification != null) {
			if (notification.getSeverity() == NotificationSeverityType.FAILURE
					|| notification.getSeverity() == NotificationSeverityType.ERROR) {
				cont = false;
			}
		}

		return cont;
	}

	private void print(Object k, Object v) {
		if (k == null || v == null) {
			return;
		}
		String key;
		String value;
		if (k instanceof String) {
			key = (String) k;
		} else {
			key = k.toString();
		}
		if (v instanceof String) {
			value = (String) v;
		} else {
			value = v.toString();
		}
		System.out.println("  " + key + ": " + value);
	}

	private void print(Object o) {
		if (o != null) {
			if (o instanceof String) {
				System.out.println((String) o);
			} else if (o instanceof Address) {
				printAddress((Address) o);
			} else if (o instanceof Calendar) {
				printTime((Calendar) o);
			} else {
				System.out.println(o.toString());
			}

		}
	}

	private void printWeight(String msg, Weight weight) {
		if (msg == null || weight == null) {
			return;
		}
		System.out.println(msg + ": " + weight.getValue() + " " + weight.getUnits());
	}

	private String getSystemProperty(String property) {
		String returnProperty = System.getProperty(property);
		if (returnProperty == null) {
			return "XXX";
		}
		return returnProperty;
	}
}
