package com.vamshi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vamshi.service.ShoppingStore;

public class ThrowsAdviceTest {
	public static void main(String[] args)throws Throwable{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/vamshi/cfgs/applicationContext.xml");
		ShoppingStore store=ctx.getBean("service",ShoppingStore.class);
		store.calculateSingleProductBillAmt(-1, 10);
		((AbstractApplicationContext) ctx).close();
		
	}

}
