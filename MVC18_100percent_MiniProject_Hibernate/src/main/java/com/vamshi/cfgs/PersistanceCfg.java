package com.vamshi.cfgs;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;


import com.vamshi.bo.UserBO;

@Configuration
@ComponentScan(basePackages = "com.vamshi.dao")
public class PersistanceCfg {
	
	@Bean
	public JndiObjectFactoryBean createJOFB() {
		JndiObjectFactoryBean jofb=new JndiObjectFactoryBean();
				jofb.setJndiName("java:/comp/env/DsJndi");
		return jofb;
	}
	
	@Bean
	public LocalSessionFactoryBean createLSFB() {
		
		Properties props=new Properties();
		LocalSessionFactoryBean factory=null;
		factory=new LocalSessionFactoryBean();
				factory.setDataSource((DataSource)createJOFB().getObject());
				factory.setAnnotatedClasses(UserBO.class);
				factory.setAnnotatedPackages("com.vamshi.bo");
				props.setProperty("show_sql", "true");
				props.setProperty("dialect", "org.hibernate.dialect.OracleDialect");
				factory.setHibernateProperties(props);
				
		return factory;
	}
	@Bean
	public HibernateTemplate createHT() {
		return new HibernateTemplate(createLSFB().getObject());
	}

}
