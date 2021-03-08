package com.vamshi.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vamshi.beans.Student;

public class ClientTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Student std=context.getBean("student",Student.class);
        System.out.println(std.toString());
	}

}
