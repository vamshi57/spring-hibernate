package com.vamshi.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object rVal;
		System.out.println("entering into logging");
		rVal=invocation.proceed();
		System.out.println("exiting from app");
		return rVal;
	}

}
