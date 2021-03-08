package com.vamshi.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class InterestCutAdvice implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {
	    Object args[] =invocation.getArguments();
	    
	    Object  retVal;
	    if((Float)args[0]<=100000.0f) {
	    	args[1]=(Float)args[1]-0.5f;
	    	System.out.println("interest rate :"+args[1]);
	    	retVal=invocation.proceed();
	    	
	    }
	    else {
	    	retVal=invocation.proceed();
	    }
	    return retVal;
	}

}
