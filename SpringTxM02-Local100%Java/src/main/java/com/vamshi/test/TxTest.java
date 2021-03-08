package com.vamshi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.vamshi.cfgs.ApplicationCfg;
import com.vamshi.service.BankService;


public class TxTest {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(ApplicationCfg.class);
	BankService proxy=ctx.getBean("bankService" ,BankService.class);
	System.out.println(proxy.transaction(101,102, 1000f));
	System.out.println(proxy.getClass().getName()+" "+proxy.getClass().getSuperclass());
	((AbstractApplicationContext) ctx).close();
	
    
	}
	
}
