package com.vamshi.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp=context.getBean("emp",Employee.class);
		System.out.println("ClientTest.main()");
		
		 System.out.println(emp.toString());
        ((AbstractApplicationContext) context).close();
      
		
	}

}
