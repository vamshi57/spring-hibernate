package com.vamshi.sp05;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context;
		context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
	   Flipkart fk= context.getBean("flipkart", Flipkart.class);
	
	   // fk.welcomeMessage();

	  
	    System.out.println(fk+"------->");
	   System.out.println( context.isPrototype("flipkart"));
	   context.close();
	   
	    
	 
	    
	}
	

}
