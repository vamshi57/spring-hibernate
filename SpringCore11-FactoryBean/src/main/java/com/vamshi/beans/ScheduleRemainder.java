package com.vamshi.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class ScheduleRemainder {
	@Autowired
	private Date date;

	
	public ScheduleRemainder() {
		System.out.println("scheduleRemainder-0 param constructor");
	}
	public ScheduleRemainder(Date date) {
		System.out.println("ScheduleRemainder-1 param constructor");
		System.out.println("--------------------------------------");
		this.date = date;
	}
	public String getScheduleRemainder() {
		Date sysdate=new Date();
		if(sysdate.getYear()==date.getYear()&&sysdate.getMonth()==date.getMonth()&&sysdate.getDate()==date.getDate()) {
			return "you have schedule to work";
		}
		return "you can relax now" ;
		
	}
	
	

}
