package com.vamshi.cfgs;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.atomikos.jdbc.AtomikosDataSourceBean;

@Configuration
@ComponentScan(basePackages = "com.vamshi.dao")
public class PersistanceConfig {
	
	@Bean(value = "oraXADs")
	public AtomikosDataSourceBean getoraAD() {
		AtomikosDataSourceBean ad=new AtomikosDataSourceBean();
		ad.setUniqueResourceName("oraXA"); 
		ad.setXaDataSourceClassName("oracle.jdbc.xa.client.OracleXADataSource");
		Properties props=new Properties();
		props.setProperty("databaseName","xe");
		props.setProperty("user","system");
		props.setProperty("password", "root");
		props.setProperty("URL", "jdbc:oracle:thin:@localhost:1521:xe");
		ad.setXaProperties(props);
		return ad;
	}
	

	@Bean(value = "mysqlXADs")
	public AtomikosDataSourceBean getmysqlAD() {
		AtomikosDataSourceBean ad=new AtomikosDataSourceBean();
		ad.setUniqueResourceName("mysqlXA"); 
		ad.setXaDataSourceClassName("com.mysql.cj.jdbc.MysqlXADataSource");
		Properties props=new Properties();
		props.setProperty("databaseName","com.mysql.cj.jdbc.Driver");
		props.setProperty("user","root");
		props.setProperty("password", "root");
		props.setProperty("URL", "jdbc:mysql://localhost:3306/bank");
		ad.setXaProperties(props);
		return ad;
	}
	
	@Bean("orajt")
	public JdbcTemplate getOraJt() {
		JdbcTemplate jt=new JdbcTemplate(getoraAD());
		return jt;
	}
	@Bean("mysqljt")
	public JdbcTemplate getMysqlJt() {
		JdbcTemplate jt=new JdbcTemplate(getmysqlAD());
		return jt;
	}
	
	
	
	

}
