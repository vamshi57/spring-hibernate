package com.vamshi.wishmessage;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;
	 
	public void setDate(Date date) {
		this.date=date;
	}
	
	public String generateWishMessage(String user) {
		int hours=date.getHours();
		if(hours<12) {
			return "gm::"+user;
		    }
		else if(hours<16) {
		   return "gA::"+user;
		   }
		else if(hours<20) {
			return "GE::"+user;
		}
		else {
			return "gn::"+user;
		}
		
	}
}
