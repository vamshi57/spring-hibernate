package com.vamshi.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vamshi.beans.MyServletContainer;

public class Test {

	public static void main(String[] args) {
	      ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	      MyServletContainer container=context.getBean("myservlet",MyServletContainer.class);
	      container.processRequest("hello");
	      System.out.println(container.getClass()+" "+container.getClass().getSuperclass());
	      container.processRequest("hello");

	}

}
