package com.vamshi.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
	@Autowired
	Engine eng;
	
	public void tour() {
		System.out.println("tour is started :from hyd to mumbai");
	   eng.start();
	   
	   eng.end();
	   System.out.println("tour is stoped  : in mumbai");
		
	}
	
	

}
