package com.vamshi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.vamshi.dto.ProductDto;
import com.vamshi.service.ECommerceStore;
import com.vamshi.service.IECommerceStore;

@SpringBootApplication
@EnableAspectJAutoProxy 
public class SpringAspectJ12BasicAroundAdviceSpringbootApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		ctx=SpringApplication.run(SpringAspectJ12BasicAroundAdviceSpringbootApplication.class, args);
		ECommerceStore store=ctx.getBean("ecommerce",ECommerceStore.class);
		ProductDto dto=new ProductDto(101, "tooth",101.0f,5f);
		ProductDto dto1=new ProductDto(101, "tooth",101.0f,5f);
	     store.addToCart(dto);
	     store.addToCart(dto1);
	     
	     System.out.println(store.calcBillAmount(5));
	     System.out.println(store.calcBillAmount(5));
	
	}

}
