package com.vamshi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vamshi.helloBean.HelloBean;

public class Test {
	public static void main(String[] args)throws Exception {
		
		ApplicationContext context;
		context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		HelloBean hello1=(HelloBean)context.getBean("helloBean1");
		HelloBean hello11=(HelloBean)context.getBean("helloBean1");
		HelloBean hello12=(HelloBean)context.getBean("helloBean1");
		HelloBean hello2=(HelloBean)context.getBean("helloBean2");
		HelloBean hello3=(HelloBean)context.getBean("helloBean3");
		System.out.println(hello1);
		System.out.println(hello11);
		System.out.println(hello12);
		System.out.println(hello2);
		System.out.println(hello3);
	}

}
