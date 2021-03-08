package com.vamshi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vamshi.service.BankService;

public class TxTest {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/vamshi/cfgs/applicationContext.xml");
		BankService proxy=ctx.getBean("bankService",BankService.class);
		System.out.println(proxy.transaction(101, 102, 1000f));
		System.out.println(proxy.getClass().getName()+" //super class name    :"+proxy.getClass().getSuperclass());
		((AbstractApplicationContext)ctx).close();	
	}
}
