package com.vamshi.advice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.aspectj.lang.ProceedingJoinPoint;

public class CacheAdvice {
	
	Map<String, Object> cacheMap=new HashMap<>();
	
	public Object cacheFeature(ProceedingJoinPoint pjp)throws Throwable {
		String key=pjp.getSignature().getName()+""+Arrays.deepToString(pjp.getArgs());
		Object retVal=null;
		if(!cacheMap.containsKey(key)) {
			retVal=pjp.proceed();
			cacheMap.put(key, retVal);
			
		}
		else {
			retVal=cacheMap.get(key);
		}
		return retVal;
		
	}

}
