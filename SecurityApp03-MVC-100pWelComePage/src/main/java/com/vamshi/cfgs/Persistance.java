package com.vamshi.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jndi.JndiObjectFactoryBean;

@Configuration
public class Persistance {
	@Bean
	public JndiObjectFactoryBean createJOFB() {
		JndiObjectFactoryBean jofb=new JndiObjectFactoryBean();
		jofb.setJndiName("java:/comp/env/DsJndi");
		return jofb;
	}

}
