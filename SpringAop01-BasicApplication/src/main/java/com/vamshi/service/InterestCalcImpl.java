package com.vamshi.service;

import org.springframework.stereotype.Service;

@Service
public class InterestCalcImpl implements InterestCalc{
	public final  float  simpleInterest(float pAmount,float rate,float time) {
		System.out.println("InterestCalc.simpleInterest()"); 
		return (pAmount*rate*time)/100.0f;
	}
	
	
	

}
