package com.vamshi.coach;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client{

	public static void main(String[] args) {
	
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	Coach c1=context.getBean("coach",Coach.class);
	Coach c2=context.getBean("coach",Coach.class);
	if(c1==c2) {
		System.out.println("one object is used for to getbeancalls ");
	}
	else {
		System.out.println("difference object");
	}
	System.out.println(c1.toString()+" "+c2.toString());
	System.out.println(c1.hashCode()+" "+c2.hashCode());
	
	
	
           context.close();
	}

}
