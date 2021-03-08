package com.vamshi.cfgs;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class AOPConfig {
	@Autowired
	private SessionFactory sf;
	
	@Bean(name="dsTxMgr")
	public HibernateTransactionManager createHbTxMgr() {
		return new HibernateTransactionManager(sf);
	}

}
