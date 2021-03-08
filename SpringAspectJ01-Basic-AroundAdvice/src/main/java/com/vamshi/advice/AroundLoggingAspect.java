package com.vamshi.advice;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.spi.Configurator;
import org.aspectj.lang.ProceedingJoinPoint;

public class AroundLoggingAspect {
	private static Logger logger=Logger.getLogger(AroundLoggingAspect.class);
	private float cupon;

	public void setCupon(float cupon) {
		this.cupon = cupon;
	}



	static{
		try {
			
		PropertyConfigurator.configure("src/main/java/com/vamshi/commons/log4j.properties");
		logger.info("log4j Activated");
		
		}
		catch(Exception e){
			logger.fatal("unknown exception");
			
			e.printStackTrace();
			
		}
	}

	
	
	public Object logging(ProceedingJoinPoint pjp)throws Throwable {
		Object args[]=pjp.getArgs();
		System.out.println("AroundLoggingAspect.logging()");
		Object retVal=null;
		logger.debug("Entering into"+pjp.getSignature()+"with "+Arrays.deepToString(pjp.getArgs()));
		if(pjp.getSignature().getName().equalsIgnoreCase("calcBillAmount")) {
			args[0]=(Float)args[0]+cupon;
		}
		retVal=pjp.proceed(args);
		logger.debug("Exiting from"+pjp.getSignature()+"with "+Arrays.deepToString(pjp.getArgs()));
		return retVal;
		
	}

}
