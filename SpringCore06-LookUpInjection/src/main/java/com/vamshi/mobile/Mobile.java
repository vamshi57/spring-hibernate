package com.vamshi.mobile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	private String idref;
	
	public Mobile() {
		System.out.println("----------------------------Mobile.0 arg-------------------------------------------");
	}
	public void setIdref(String idref) {
		this.idref=idref;
	}
	public void mobileCharging() {
		System.out.println("Mobile.mobileCharging()");
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		MobileCharging mc=context.getBean(idref,MobileCharging.class);
		mc.mobileCharger();
		mc.gettingCharging();
	}
	public void game()
	{
		System.out.println("Mobile.game()");
	}
	public void  calling() {
		System.out.println("Mobile.calling()");
	}

}
