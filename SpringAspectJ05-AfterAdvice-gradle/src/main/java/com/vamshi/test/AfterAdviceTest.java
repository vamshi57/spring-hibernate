package com.vamshi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vamshi.service.ShoppingStore;

public class AfterAdviceTest {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/vamshi/cfgs/applicationContext.xml");
		ShoppingStore proxy=ctx.getBean("service", ShoppingStore.class);
		double billAmt= proxy.shopping(new String[] {
				"item1",
				"item2",
				"item3",
				"item4"
				},
				new double[] 
						{1000.0,1000.0,1500.0,1200.0});
		System.out.println(billAmt);
		System.out.println(proxy.getClass().getName());
		((AbstractApplicationContext) ctx).close();
	
	}

}
