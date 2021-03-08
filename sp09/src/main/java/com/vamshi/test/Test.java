package com.vamshi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.vamshi.beans.Vehicle;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new FileSystemXmlApplicationContext("src/main/java/ApplicationContext.xml");
		Vehicle vehicle=context.getBean("vehicle",Vehicle.class);
		System.out.println(vehicle);

	}

}
