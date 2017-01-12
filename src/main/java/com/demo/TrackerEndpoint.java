package com.demo;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.demo.client.FedexTrackerClient;
import com.demo.domain.WriteEventLog;
import com.demo.domain.WriteEventLogResponse;
import com.demo.domain.WriteEventLogReturn;
import com.demo.fedex.domain.Address;
import com.demo.fedex.domain.CarrierCodeType;
import com.demo.fedex.domain.ClientDetail;
import com.demo.fedex.domain.Localization;
import com.demo.fedex.domain.PagingDetail;
import com.demo.fedex.domain.TrackIdentifierType;
import com.demo.fedex.domain.TrackPackageIdentifier;
import com.demo.fedex.domain.TrackReply;
import com.demo.fedex.domain.TrackRequest;
import com.demo.fedex.domain.TrackSelectionDetail;
import com.demo.fedex.domain.TransactionDetail;
import com.demo.fedex.domain.VersionId;
import com.demo.fedex.domain.WebAuthenticationCredential;
import com.demo.fedex.domain.WebAuthenticationDetail;

@Endpoint
@Component
public class TrackerEndpoint {
	private static final String NAMESPACE_URI = "http://demo.com/ws/track/v12";

	@Autowired
	private FedexTrackerClient fedexTrackerClient;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "writeEventLog")
	@ResponsePayload
	public WriteEventLogResponse trackFedEx(@RequestPayload WriteEventLog request) {
		WriteEventLogResponse response = new WriteEventLogResponse();
		WriteEventLogReturn eventLogReturn = new WriteEventLogReturn();

		TrackReply reply = fedexTrackerClient.trackFedEx(createRequest(request));
		
		
		// eventLogReturn.setHighestSeverity(reply.getHighestSeverity());

		response.setResponse(eventLogReturn);
		response.setResponse(TrackerMapper.INSTANCE.map(reply));
		// response.setCountry(countryRepository.findCountry(request.getName()));

		return response;
	}

	private TrackRequest createRequest(WriteEventLog writeEventLog) {
		TrackRequest request = new TrackRequest();
		WebAuthenticationDetail authenticationDetail = new WebAuthenticationDetail();
		WebAuthenticationCredential authenticationCredential = new WebAuthenticationCredential();
		authenticationCredential.setKey("v666RJqeaJPZnqQb");
		authenticationCredential.setPassword("bYtyAOZVyCB8BSx28bswXCgSD");
		authenticationDetail.setUserCredential(authenticationCredential);
		request.setWebAuthenticationDetail(authenticationDetail);
		ClientDetail clientdetail = new ClientDetail();
		clientdetail.setAccountNumber("510087828");
		clientdetail.setMeterNumber("118775751");
		clientdetail.setIntegratorId("123");
		Localization localization = new Localization();
		localization.setLanguageCode("EN");
		localization.setLocaleCode("US");
		clientdetail.setLocalization(localization);
		request.setClientDetail(clientdetail);
		TransactionDetail transactionDetail = new TransactionDetail();
		transactionDetail.setLocalization(localization);
		transactionDetail.setCustomerTransactionId(writeEventLog.getRequest().getInvoiceNo());
		request.setTransactionDetail(transactionDetail);
		VersionId versionId = new VersionId();
		versionId.setIntermediate(0);
		versionId.setMajor(12);
		versionId.setMinor(0);
		versionId.setServiceId("trck");
		request.setVersion(versionId);
		TrackSelectionDetail trackSelectionDetail = new TrackSelectionDetail();
		trackSelectionDetail.setCarrierCode(CarrierCodeType.FDXE);
		TrackPackageIdentifier trackPackageIdentifier = new TrackPackageIdentifier();
		trackPackageIdentifier.setType(TrackIdentifierType.TRACKING_NUMBER_OR_DOORTAG);// TODO
																						// need
																						// event
																						// type
		trackPackageIdentifier.setValue(writeEventLog.getRequest().getTrackingNumber());
		trackSelectionDetail.setTrackingNumberUniqueIdentifier(writeEventLog.getRequest().getTrackingNumber());
		trackSelectionDetail.setPackageIdentifier(trackPackageIdentifier);
		trackSelectionDetail.setShipmentAccountNumber("510087020");
		trackSelectionDetail.setSecureSpodAccount("510051408");
		Address address = new Address();
		address.getStreetLines().add(writeEventLog.getRequest().getEventArrivalLocation());
		address.setCity(writeEventLog.getRequest().getEventCity());
		address.setStateOrProvinceCode(writeEventLog.getRequest().getEventState());
		address.setPostalCode(writeEventLog.getRequest().getEventZip());
		address.setCountryCode(writeEventLog.getRequest().getEventCountry());
		trackSelectionDetail.setDestination(address);
		PagingDetail pagingDetail = new PagingDetail();
		pagingDetail.setNumberOfResultsPerPage(new BigInteger("100"));
		pagingDetail.setPagingToken("100");
		trackSelectionDetail.setPagingDetail(pagingDetail);
		request.getSelectionDetails().add(trackSelectionDetail);
		return request;
	}

}
