package com.vamshi.beans;

public class BankService {
	public BankService() {
		System.out.println("BankService.BankService() 0-param");
	}
  public float alInterest(float amount,float time) {
	 
	  float total=amount*time*(5.0f);
	  System.out.println(total);
	  return total ;
	  
  }
 
}
