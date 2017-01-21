package com.demo.util;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.demo.client.UpdatedStatus;
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

	public WriteEventLogDomain getWriteEventLog() throws SQLException {
		return this.getJdbcTemplate().query("SELECT * FROM SHIPING_EVENT_LOG  where status != 'DELIVERED'",
				new WriteEventLogExtractor());
	}

	public void manageEvent(UpdatedStatus status, WriteEventLogDomain eventLogDomain) {
		if (status.getUpdatedStatus() != null && status.getUpdatedStatus().equalsIgnoreCase("DL")) {
			this.getJdbcTemplate().execute("UPDATE SHIPING_EVENT_LOG set status = 'DELIVERED', EVENTTYPE = '"
					+ status.getUpdatedStatus() + "' WHERE TRACKING_NUMBER ='"+eventLogDomain.getTrackingNumber()+"'");
		} else {
			this.getJdbcTemplate()
					.execute("UPDATE SHIPING_EVENT_LOG set EVENTTYPE = '" + status.getUpdatedStatus()
							+ "', EVENTDESCRIPTION='" + status.getDescription() + "', EVENTSTATUSEXCEPTIONCODE='"
							+ status.getStatusExceptionDescription() + "' WHERE TRACKING_NUMBER ='"+eventLogDomain.getTrackingNumber()+"'");
		}

	}

}
