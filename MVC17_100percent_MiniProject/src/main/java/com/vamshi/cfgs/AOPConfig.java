package com.vamshi.cfgs;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class AOPConfig {
	@Autowired
	private DataSource ds;
	
	@Bean(name="dsTxMgr")
	public DataSourceTransactionManager createDsTxMgr() {
		return new DataSourceTransactionManager(ds);
	}

}
