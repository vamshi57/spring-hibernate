package com.vamshi.service;

public class CarShowRoom {
	
	public String purchaseCar(String modelname,float price,String color,String executive) {
		
		
		if(price<1000000 && modelname.equalsIgnoreCase("baleno")) {
			return modelname+" car having price :"+price+"rs with color :"+color
					+" sold to customer by executive "+executive+"";
		}else {
			return modelname+" car having price :"+price+"rs with color :"+color
					+"not available to sell ";
		}
		
	
	}

}
