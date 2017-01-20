package com.demo.util;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.demo.domain.WriteEventLogRequest;


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

	public WriteEventLogRequest getWriteEventLog() throws SQLException {
		return this.getJdbcTemplate().query("SELECT * FROM SHIPING_EVENT_LOG  where status != 'DELIVERED'", new WriteEventLogExtractor());
	}

}
