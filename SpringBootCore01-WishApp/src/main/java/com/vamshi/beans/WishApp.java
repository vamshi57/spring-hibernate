package com.vamshi.beans;


import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wish")
public class WishApp {
	@Autowired
	private Calendar cl;
	
	public WishApp() {
		System.out.println("wishApp 0-arg Constructor");
	}
	
	
	
	public void getWish() {
		int hour=0;
		System.out.println("getWish()");
		hour=cl.get(Calendar.HOUR_OF_DAY);
		if(hour<10) {
			System.out.println("good morning");
		}
		else if(hour<15) {
			System.out.println("good afternoon");
			
		}
		else if(hour<18){
			System.out.println("good evening");
			
		}
		else {
			System.out.println("good night");
		}
		
	}
	

}
