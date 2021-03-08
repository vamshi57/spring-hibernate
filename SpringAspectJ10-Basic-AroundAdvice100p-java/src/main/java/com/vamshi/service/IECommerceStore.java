package com.vamshi.service;

import org.springframework.stereotype.Service;

import com.vamshi.dto.ProductDto;

public interface IECommerceStore {
	 public String addToCart(ProductDto  dto);
	 public void showCart();
	 public  float calcBillAmount(float cuponDiscount);
	 
}
