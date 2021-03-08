package com.vamshi.sp07;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Student st=context.getBean("st",Student.class);
		context.close();
	}

}
