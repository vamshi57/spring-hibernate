package com.vamshi.advice;

import org.aspectj.lang.JoinPoint;

import com.vamshi.error.InternalProblemException;

public class CommonExceptionGrapher {

	public void  exceptionGraphing(JoinPoint jp,IllegalAccessException iae) {
		throw new InternalProblemException(iae.getMessage());
	}
	

}
