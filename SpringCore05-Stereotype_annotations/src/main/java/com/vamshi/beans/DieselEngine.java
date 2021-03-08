package com.vamshi.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class DieselEngine implements Engine {
	@Value("${car.value}")
	private long carId; 

	public void start() {
		System.out.println("carId  :"+carId);
		System.out.println("diesel engine started");

	}

	public void end() {
	  System.out.println("diesel engine stoped");

	}

}
