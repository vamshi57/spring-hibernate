package com.vamshi.sp06;

import org.springframework.beans.factory.annotation.Autowired;

public class TennisCoach  {
	@Autowired
	private TennisBall tennisBall;
  
	
	public TennisCoach() {
    	System.out.println(tennisBall.toString());
			
	}
}
