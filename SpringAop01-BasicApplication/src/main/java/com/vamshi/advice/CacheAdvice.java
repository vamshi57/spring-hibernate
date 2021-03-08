package com.vamshi.advice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CacheAdvice implements MethodInterceptor {
	private Map<String, Object> cacheMap=new HashMap<String, Object>();

	public Object invoke(MethodInvocation invocation) throws Throwable {
		String key=invocation.getMethod().getName()+Arrays.deepToString(invocation.getArguments());
		Object  retVal=null;
		
		if(!cacheMap.containsKey(key)) {
			retVal=invocation.proceed();
			cacheMap.put(key, retVal);	
		}else {
		   retVal=cacheMap.get(key);
		}
		return retVal;
	}

}
