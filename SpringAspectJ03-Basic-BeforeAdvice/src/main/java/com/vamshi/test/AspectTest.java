package com.vamshi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vamshi.service.CarShowRoom;

public class AspectTest {
	public static void main(String[] args) {
	ApplicationContext ctx=null;
	ctx=new ClassPathXmlApplicationContext("com/vamshi/cfgs/applicationContext.xml");
	CarShowRoom service=ctx.getBean("service",CarShowRoom.class);
	System.out.println(service.purchaseCar("baleno", 800000, "blue", "suresh"));
	
	((AbstractApplicationContext)ctx).close();
	}
}