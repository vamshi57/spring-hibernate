package com.vamshi.advice;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.aspectj.lang.JoinPoint;

public class CommonExceptionLoggerAspect {
	
	public static  Logger logger=Logger.getLogger(CommonExceptionLoggerAspect.class);
	
	static {

		try {
	    	PropertyConfigurator.configure("src/main/java/com/vamshi/commons/log4j.properties");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void exceptionLogger(JoinPoint jp,Exception ex) {
		System.out.println("1");
		logger.error(ex+ " exception is raised in  "+jp.getSignature()+ " method with args"+Arrays.deepToString(jp.getArgs()));
	}
	
	

}
