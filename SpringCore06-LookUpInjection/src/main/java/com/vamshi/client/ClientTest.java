package com.vamshi.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vamshi.mobile.Mobile;

public class ClientTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Mobile mobile=context.getBean("mobile",Mobile.class);
		mobile.calling();
		mobile.game();
		mobile.mobileCharging();
		

	}

}
