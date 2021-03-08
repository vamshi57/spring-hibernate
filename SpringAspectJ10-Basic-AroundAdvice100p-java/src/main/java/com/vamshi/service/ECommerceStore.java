package com.vamshi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vamshi.dto.ProductDto;

@Service("service")
public final class ECommerceStore implements IECommerceStore{
   List<ProductDto> cartList=new ArrayList<>();
   //adding items to cart
   
   
   public String addToCart(ProductDto  dto) {
	   cartList.add(dto);
	   
	   return dto.getPname()+"is successfuly added to cart ";
   }
   
   //print cart items
   public void showCart() {
	   cartList.forEach(System.out::println);
	   
   }
   
   //calculate bill amount
   public  float calcBillAmount(float cuponDiscount) {
	   System.out.println("ECommerceStore.calcBillAmount()    :"+cuponDiscount+"%");
	   System.out.println("target");
	    float bamt=0.0f;
	    float finalAmount=0.0f;
	    
		 bamt=(float)cartList.stream().mapToDouble(dto->
	          dto.getPrice()* dto.getQty()).sum();
      finalAmount=bamt-(bamt*(cuponDiscount/100.0f));		 
	  
	return finalAmount;
	
	
}
   
   

}
