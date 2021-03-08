package com.vamshi.travel;

import java.util.Arrays;

public class TourPlan {
	private  String[] places;
	
	

	public TourPlan() {
		System.out.println("TourPlan.TourPlan()-0 param constructor");
		
	}
	
	  public void setPlaces(String[] places) {
	  
	  this.places = places;
	  }
	  
	  public String[] getPlaces() {
			return places;
		}
	
	@Override
	public String toString() {
		return "TourPlan [places=" + Arrays.toString(places) + "]";
	}
	


}
