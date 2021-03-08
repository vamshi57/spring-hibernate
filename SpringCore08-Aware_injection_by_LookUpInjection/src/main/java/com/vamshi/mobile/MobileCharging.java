package com.vamshi.mobile;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("mobile_charging")
@Scope("prototype")
public class MobileCharging {
	  
	
	public MobileCharging() {
		System.out.println("---------MobileCharging 0 arg-");
	}
	public void mobileCharger() {
		System.out.println("i got charger-------"+this.hashCode());
		
	}
	
	

}
