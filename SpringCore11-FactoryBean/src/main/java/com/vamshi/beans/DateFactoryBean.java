package com.vamshi.beans;

import java.util.Date;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class DateFactoryBean implements FactoryBean<Date> {
	@Value("2020")
	private int year;
	 @Value("5")
	private int month;
	 @Value("16")
	private int date;
	
	
	public DateFactoryBean() {
		System.out.println("DateFactoryBean.0-arg constructor");
		System.out.println("------------------------------------");
	}
	
	

	public void setYear(int year) {
		this.year = year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public Date getObject() throws Exception {
		System.out.println("DateFactoryBean.getObject()");
		
		return new Date(year-1900,month-1,date);
	}

	public Class<?> getObjectType() {
		System.out.println("DateFactoryBean.getObjectType()");
		
		return Date.class;
	}
	public boolean isSingleton() {
		System.out.println("DateFactoryBean.isSingleton()");
		return true;
	}

}
