package com.vamshi.sp02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class SetterInjectionTest {

	public static void main(String[] args) {
	         ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
			WishMessageGenerator obj=(WishMessageGenerator)context.getBean("wmg");
			 System.out.println("result:"+obj.generateWishMessage("vamshi"));
          }
	}


