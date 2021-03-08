package com.vamshi.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;


@Configuration
public class Config {
	@Autowired
	private DataSource ds;
	
	@Bean
	public JdbcTemplate getJT() {
		return new JdbcTemplate(ds);
	}
	
	@Bean
	public SimpleJdbcCall getSJI() {
		return new SimpleJdbcCall(getJT());
	}

}
