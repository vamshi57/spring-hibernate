package com.vamshi.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.vamshi.dao")
public class PersistanceCfg {
	
	@Bean
	public HikariDataSource getHKDS() {
		HikariDataSource hkDs=new HikariDataSource();
		hkDs.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		hkDs.setJdbcUrl("jdbc:mysql://localhost:3306/bank?useSSL=false");
		hkDs.setUsername("root");
		hkDs.setPassword("root");
		return hkDs;
	}
	
	@Bean
	public JdbcTemplate getJT() {
		JdbcTemplate jt=new JdbcTemplate(getHKDS());
		return jt;
	}

}
