package com.vamshi.servicelocator;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import com.vamshi.external.External;
import com.vamshi.external.ExternalImpl;
@Component("locator")
public class ServiceLocactor implements FactoryBean<External>{

	@Override
	public External getObject() throws Exception {
		External ex=new ExternalImpl();
		
		return ex;
	}

	@Override
	public Class<?> getObjectType() {
		
		return External.class;
	}
	public boolean isSingleton() {
		return true;
	}

}
