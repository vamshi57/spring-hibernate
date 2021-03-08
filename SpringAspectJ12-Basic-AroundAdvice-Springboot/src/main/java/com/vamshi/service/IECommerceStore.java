package com.vamshi.service;

import com.vamshi.dto.ProductDto;

public interface IECommerceStore {
	 public String addToCart(ProductDto  dto);
	 public void showCart();
	 public  float calcBillAmount(float cuponDiscount);
	 
}
