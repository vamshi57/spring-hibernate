package com.vamshi.beans;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Vehicle {

	private Engine engg;
    @Inject
    public void setEngg(Engine engg) {
		this.engg = engg;
	}
	@Override
	public String toString() {
		return "Vehicle [engg=" + engg + "]";
	}
    
	

}
