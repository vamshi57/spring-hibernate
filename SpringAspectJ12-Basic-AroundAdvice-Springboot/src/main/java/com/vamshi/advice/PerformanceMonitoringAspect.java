package com.vamshi.advice;
import java.sql.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component("performance")
@Aspect

public class PerformanceMonitoringAspect {
	@Around("execution(float com.vamshi.service.ECommerceStore.calcBillAmount(..))")
	@Order(value=3)
	public Object monitor(ProceedingJoinPoint pjp) throws Throwable{
		long start=0,end=0;
		Object retVal=null;
		start=System.currentTimeMillis();
		retVal=pjp.proceed();
		end=System.currentTimeMillis();
		System.out.println("Time taken  :"+(end-start)+"ms");
		
		
		return retVal;
	}

}
