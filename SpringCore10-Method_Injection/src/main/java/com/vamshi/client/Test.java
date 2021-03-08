package com.vamshi.client;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vamshi.beans.BankService;


public class Test {

	public static void main(String[] args) {
		
	      ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	      BankService bank=context.getBean("bank",BankService.class);
	      bank.alInterest(1000f,12.0f );
	      

	}

}
