package com.vamshi.test;

import javax.security.sasl.AuthorizeCallback;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vamshi.manager.AuthenticationManager;
import com.vamshi.service.BankMgmtService;

public class BeforeAdviceTest {
	public static void main(String[] args) {
		AuthenticationManager manager;
		BankMgmtService service;
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/vamshi/cfgs/applicationContext.xml");
		manager=ctx.getBean("authManager",AuthenticationManager.class);
		service=ctx.getBean("bankService",BankMgmtService.class);
		manager.signIn("vamshi", "vvk");
		
		System.out.println(service.depositeMoney(101, 100.0f));
		manager.signOut();
		((AbstractApplicationContext) ctx).close();
		
		
	}

}
