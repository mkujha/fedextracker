package com.demo.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.demo.domain.WriteEventLogRequest;

public class WriteEventLogExtractor implements ResultSetExtractor<WriteEventLogRequest> {

	@Override
	public WriteEventLogRequest extractData(ResultSet rs) throws SQLException, DataAccessException {
		WriteEventLogRequest writeEventLogRequest = new WriteEventLogRequest();
		String trackingNo ="";
		while (rs.next()) {
			//writeEventLogRequest.setInvoiceNo(rs.getString("INVOICENO"));
			//writeEventLogRequest.setEventArrivalLocation(rs.getString("EVENTARRIVALLOCATION"));
			//writeEventLogRequest.setEventCity(rs.getString("EVENTCITY"));
			//writeEventLogRequest.setEventCountry(rs.getString("EVENTCOUNTRY"));
			// writeEventLogRequest.setEventDate(rs.getTimestamp(("EVENTDATE"));
			//writeEventLogRequest.setEventDescription(rs.getString("EVENTDESCRIPTION"));
			// STATUS
			//writeEventLogRequest.setInvoiceNo(rs.getString("INVOICE_NO"));
			//writeEventLogRequest.setEventZip(rs.getString("EVENTZIP"));
			//writeEventLogRequest.setEventState(rs.getString("EVENTSTATE"));
			//writeEventLogRequest.setEventType(rs.getString("EVENTTYPE"));
			trackingNo = trackingNo +"," + rs.getString("TRACKING_NUMBER");
			writeEventLogRequest.setTrackingNumber(trackingNo.substring(1,trackingNo.length()));
			//writeEventLogRequest.setEventStatusExceptionCode(rs.getString("EVENTSTATUSEXCEPTIONCODE"));
			// writeEventLogRequest.setEventStatus(rs.getString("EVENTSTATUSEXCEPTIONCODE"));
			// EVENTSTATUSEXCEPTIONDESC

		}
		return writeEventLogRequest;
	}

}
