package com.vamshi.advice;
import java.sql.Date;

import org.aspectj.lang.ProceedingJoinPoint;

public class PerformanceMonitoringAspect {
	
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
