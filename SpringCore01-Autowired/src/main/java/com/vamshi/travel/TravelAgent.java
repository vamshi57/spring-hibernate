package com.vamshi.travel;


public class TravelAgent {
	
	private TourPlan tp;
	public TravelAgent(TourPlan tp) {
		this.tp=tp;
		
	}
 
	 
	@Override
	public String toString() {
		return "TravelAgent [tp=" + tp + "]";
	}
	

}
