package com.vamshi.advicetest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.vamshi.dto.ProductDto;
import com.vamshi.service.IECommerceStore;

public class AdivceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		IECommerceStore proxyStore=null;
		
		ctx=new AnnotationConfigApplicationContext(com.vamshi.cfg.ApplicationContext.class);
		proxyStore=ctx.getBean("service",IECommerceStore.class);
		
		ProductDto dto1=new ProductDto(101, "toothbrush", 27.0f, 2.0f);
		ProductDto dto2=new ProductDto(101, "paste", 27.0f, 1.0f);
		proxyStore.addToCart(dto1);
		proxyStore.addToCart(dto2);
		proxyStore.showCart();
		
		System.out.println(proxyStore.calcBillAmount(0.f));
		System.out.println(proxyStore.calcBillAmount(0.f));
		System.out.println("className   :"+proxyStore.getClass().getName()+"    super class name : "
		+proxyStore.getClass().getSuperclass().getName());
		
		((AbstractApplicationContext) ctx).close();

	}

}
