package com.vamshi.sp06;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//read spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		
		//get the bean from spring container
		TennisCoach theCoach=context.getBean("tennisCoach",TennisCoach.class);
		theCoach.getClass();
		//call a method  the bean
		
		
		context.close();

	}

}
