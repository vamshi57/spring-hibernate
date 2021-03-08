package com.vamshi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


import com.vamshi.cfgs.ApplicationConfig;
import com.vamshi.service.AccountService;

public class DistributedTest {
   public static void main(String[] args) {
	AccountService service;
	ApplicationContext ctx=new AnnotationConfigApplicationContext(ApplicationConfig.class);
	
    service=ctx.getBean("service",AccountService.class);
    boolean result=service.transferMoney(102, 201, 2000f);
    System.out.println(result);
    System.out.println(service.getClass().getName());
     
    ((AbstractApplicationContext) ctx).close();
   
   }
}
