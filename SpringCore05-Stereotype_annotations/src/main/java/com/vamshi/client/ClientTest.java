package com.vamshi.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vamshi.beans.Vehicle;

public class ClientTest {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	Vehicle vehicle=context.getBean("vehicle",Vehicle.class);
	vehicle.tour();
	((AbstractApplicationContext) context).close();
 
	}

}
