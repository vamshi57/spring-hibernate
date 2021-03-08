package com.vamshi.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vamshi.wishmessage.WishMessageGenerator;

public class ConstructorTest {

	
		public static void main(String[] args) {
	         ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
			WishMessageGenerator obj=(WishMessageGenerator)context.getBean("wmg");
			 System.out.println("result:"+obj.generateWishMessage("vamshi"));
         }

	}


