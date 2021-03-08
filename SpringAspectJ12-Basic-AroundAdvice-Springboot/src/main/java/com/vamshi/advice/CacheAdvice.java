package com.vamshi.advice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component("cache")
@Aspect
public class CacheAdvice {
	
	Map<String, Object> cacheMap=new HashMap<>();
	
	@Around("execution(float com.vamshi.service.ECommerceStore.calcBillAmount(..))")
	@Order(value=1)
	public Object cacheFeature(ProceedingJoinPoint pjp)throws Throwable {
		String key=pjp.getSignature().getName()+""+Arrays.deepToString(pjp.getArgs());
		Object retVal=null;
		if(!cacheMap.containsKey(key)) {
			retVal=pjp.proceed();
			cacheMap.put(key, retVal);
			
		}
		else {
			System.out.println("cache");
			retVal=cacheMap.get(key);
		}
		return retVal;
		
	}

}
