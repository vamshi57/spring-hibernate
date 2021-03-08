package com.vamshi.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PetrolEngine implements Engine {

	public void start() {
		System.out.println("petrol engine started");

	}

	public void end() {
		System.out.println("petrol engine stoped");

	}

}
