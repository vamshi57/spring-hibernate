package com.vamshi.sp04;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import student.Student;


public class ConstructorTest {

	public static void main(String[] args) {
	      ApplicationContext context;
	      context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
	       Student std=(Student)context.getBean("st");

              System.out.println(std.toString());	    
 	      }

	}

