package com.vamshi.cfgs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableTransactionManagement(proxyTargetClass =false)
@ComponentScan(basePackages = "com.vamshi.service")
public class AopCfg {
	@Autowired
	HikariDataSource hkDs;
	
	@Bean
	public DataSourceTransactionManager getDSTM() {
		DataSourceTransactionManager dsTxm=new DataSourceTransactionManager(hkDs);
		return dsTxm;
	}

	
}
