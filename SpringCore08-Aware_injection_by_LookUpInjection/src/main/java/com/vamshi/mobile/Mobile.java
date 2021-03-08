package com.vamshi.mobile;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("mobile")
@Scope("singleton")
@PropertySource(value = "com/vamshi/commons/info.properties")

public class Mobile implements ApplicationContextAware{
	@Value("${bean.id}")
	private String beanid;
	private ApplicationContext ctx;
	
	
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx=ctx;
		
	}
	
	public Mobile() {
		System.out.println("-Mobile.0 arg-");
        	
	}
	public void mobileCharging() {
		System.out.println("Mobile.mobileCharging()");
		MobileCharging mc=ctx.getBean(beanid,MobileCharging.class);
		mc.mobileCharger();
		
		
	}
	public void game()
	{
		System.out.println("Mobile.game()-------"+this.hashCode());
	}
	
	

}
