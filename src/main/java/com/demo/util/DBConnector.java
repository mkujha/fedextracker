package com.demo.util;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.demo.client.WriteEventLogDomain;

@Component
public class DBConnector {

	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<WriteEventLogDomain> getWriteEventLog() throws SQLException {
		return this.getJdbcTemplate().query("SELECT * FROM SHIPING_EVENT_LOG  where EVENTTYPE != 'DL'",
				new WriteEventLogExtractor());
	}

	public void manageEvent(WriteEventLogDomain status, WriteEventLogDomain eventLogDomain) {
		if (status.getEventType() != null && status.getEventType().equalsIgnoreCase("DL")) {
			this.getJdbcTemplate()
					.execute("UPDATE SHIPING_EVENT_LOG set status = 'DELIVERED', EVENTTYPE = '"
							+ status.getEventType() + "' WHERE TRACKING_NUMBER ='"
							+ eventLogDomain.getTrackingNumber() + "'");
			// Archive
			this.getJdbcTemplate().execute(
					"INSERT INTO shiping_event_log_ARCHIVE (ID, STATUS,EVENTARRIVALLOCATION, EVENTCITY, EVENTCOUNTRY, "
							+ "EVENTDATE, EVENTDESCRIPTION, EVENTSTATE, EVENTSTATUSEXCEPTIONCODE,EVENTSTATUSEXCEPTIONDESC,EVENTTYPE, "
							+ "EVENTZIP, INVOICE_NO,  TRACKING_NUMBER) SELECT ID, STATUS,EVENTARRIVALLOCATION, EVENTCITY, EVENTCOUNTRY, "
							+ "EVENTDATE, EVENTDESCRIPTION, EVENTSTATE, EVENTSTATUSEXCEPTIONCODE,EVENTSTATUSEXCEPTIONDESC, EVENTTYPE, "
							+ "EVENTZIP, INVOICE_NO,  TRACKING_NUMBER FROM shiping_event_log WHERE EVENTTYPE = 'DL'");
			// Delete
			this.getJdbcTemplate().execute("delete FROM shiping_event_log WHERE EVENTTYPE = 'DL'");
		} else if(status.getEventType() != null){
			this.getJdbcTemplate()
					.execute("UPDATE SHIPING_EVENT_LOG set EVENTTYPE = '" + status.getEventType()
							+ "', EVENTDESCRIPTION='" + status.getEventDescription() + "', EVENTSTATUSEXCEPTIONCODE='"
							+ status.getEventStatusExceptionCode() + "' WHERE TRACKING_NUMBER ='"
							+ eventLogDomain.getTrackingNumber() + "'");
		}

	}

}
