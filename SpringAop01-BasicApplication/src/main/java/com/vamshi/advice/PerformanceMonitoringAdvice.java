package com.vamshi.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PerformanceMonitoringAdvice implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		long start,end;
		Object rVal;
		start=System.currentTimeMillis();
		rVal=invocation.proceed();
		end=System.currentTimeMillis();
		System.out.println("proxy object ref  :"+this.getClass().getName()+" time taken to procces  :"+(end-start)+"millseconds  "
				+ " Business Method  :"+this.getClass().getSuperclass().getMethods()+"");
		
		
		return rVal;
	}
	
	

}
