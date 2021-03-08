package com.vamshi.sp11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
         Car car1=context.getBean("ram",Car.class);
         Car car2=context.getBean("vam",Car.class);
         System.out.println(car1.toString());
         System.out.println(car2.toString());
	}

}
