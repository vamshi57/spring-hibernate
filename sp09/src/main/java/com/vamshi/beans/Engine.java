package com.vamshi.beans;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;





@Named("eng")
public class Engine {
	private int id;
	private String type;
	@Value("1010")
	public void setId(int id) {
		this.id = id;
	}
	@Value("DDIS")
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Engine [id=" + id + ", type=" + type + "]";
	}
	

}
