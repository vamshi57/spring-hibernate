package com.vamshi.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vamshi.beans.ScheduleRemainder;

public class FactoryBeanTest {
	public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	System.out.println("------------after creating container---------");
	ScheduleRemainder schedule=	ctx.getBean("schedule",ScheduleRemainder.class);
	System.out.println(schedule.getScheduleRemainder());
	System.out.println("------------before closing container-----------------");
	((AbstractApplicationContext) ctx).close();
	}

}
