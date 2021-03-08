package com.vamshi.beans;

import java.util.Date;

import org.springframework.beans.factory.FactoryBean;

public class DateFactoryBean implements FactoryBean<Date> {
	private int year;
	private int month;
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
