package com.vamshi.sp01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		
			ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
			Restaruant restaruant=(Restaruant)context.getBean("res");
			restaruant.greetCustomer();
			
			
		}


	}


