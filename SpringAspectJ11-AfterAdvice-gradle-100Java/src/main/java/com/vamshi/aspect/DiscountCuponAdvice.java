package com.vamshi.aspect;

import java.io.FileWriter;
import java.io.Writer;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class DiscountCuponAdvice {
	
	
	@AfterReturning(returning = "billAmt",pointcut = "execution(double com.vamshi.service.ShoppingStore.shopping(..))")
	public void discountApply(JoinPoint jt,double billAmt) throws Throwable{
		
		String dcmsg=null;
		Writer writer=null;
		
		if(billAmt<5000) {
			dcmsg="5% discount is applied ";
		}
		else if(billAmt<10000) {
			dcmsg="7% discount is applied";
			
		}
		else if (billAmt<15000){
			dcmsg="10% discount is applied";
			
		}
		else {
			dcmsg="15% discount is applied";
		}
		System.out.println("aspect");
		writer=new FileWriter("E:/afteradvice.txt");
		writer.write(dcmsg);
		writer.flush();
		writer.close();	
	}

}
