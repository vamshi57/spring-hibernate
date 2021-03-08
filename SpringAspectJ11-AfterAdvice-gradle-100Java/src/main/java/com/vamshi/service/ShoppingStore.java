package com.vamshi.service;

import java.util.stream.DoubleStream;

import org.springframework.stereotype.Service;

@Service("service")
public class ShoppingStore {

	
	public double shopping(String[] items,double[] prices) {
	  double billAmt=DoubleStream.of(prices).sum();
		return billAmt;
	}

}
