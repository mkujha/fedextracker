package com.demo.util;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.demo.client.WriteEventLogDomain;
import com.demo.domain.WriteEventLogRequest;

public class WriteEventLogExtractor implements ResultSetExtractor<WriteEventLogDomain> {

	@Override
	public WriteEventLogDomain extractData(ResultSet rs) throws SQLException, DataAccessException {
		WriteEventLogDomain writeEventLogRequest = new WriteEventLogDomain();
		String trackingNo ="";
		while (rs.next()) {
			writeEventLogRequest.setEventArrivalLocation(rs.getString("EVENTARRIVALLOCATION"));
			writeEventLogRequest.setEventCity(rs.getString("EVENTCITY"));
			writeEventLogRequest.setEventCountry(rs.getString("EVENTCOUNTRY"));
			writeEventLogRequest.setEventDate(getXMLGregorianCalendar(rs.getTimestamp(("EVENTDATE"))));
			writeEventLogRequest.setEventDescription(rs.getString("EVENTDESCRIPTION"));
			// STATUS
			writeEventLogRequest.setInvoiceNo(rs.getString("INVOICE_NO"));
			writeEventLogRequest.setEventZip(rs.getString("EVENTZIP"));
			writeEventLogRequest.setEventState(rs.getString("EVENTSTATE"));
			writeEventLogRequest.setEventType(rs.getString("EVENTTYPE"));
			trackingNo = trackingNo +"," + rs.getString("TRACKING_NUMBER");
			writeEventLogRequest.setTrackingNumber(trackingNo.substring(1,trackingNo.length()));
			writeEventLogRequest.setEventStatusExceptionCode(rs.getString("EVENTSTATUSEXCEPTIONCODE"));
			writeEventLogRequest.setStatus(rs.getString("EVENTSTATUSEXCEPTIONCODE"));
			
		}
		return writeEventLogRequest;
	}

	private XMLGregorianCalendar getXMLGregorianCalendar(Timestamp ts) {
		try {
			LocalDateTime ldt = ts.toLocalDateTime();
			XMLGregorianCalendar cal = DatatypeFactory.newInstance().newXMLGregorianCalendar();
			cal.setYear(ldt.getYear());
			cal.setMonth(ldt.getMonthValue());
			cal.setDay(ldt.getDayOfMonth());
			cal.setHour(ldt.getHour());
			cal.setMinute(ldt.getMinute());
			cal.setSecond(ldt.getSecond());
			cal.setFractionalSecond(new BigDecimal("0." + ldt.getNano()));
			return cal;
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		return null;
	}

}
