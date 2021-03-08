package com.vamshi.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vamshi.manager.AuthenticationManager;
@Component
@Aspect
public class SecurityCheckAspect {
	@Autowired
	private AuthenticationManager manager;
	
	@Around("execution(String com.vamshi.service.BankMgmtServiceImpl.*(..))")
	public void check(JoinPoint jp)throws Throwable{
		System.out.println("aspect");
		if(!manager.isAuthenticated()) {
			throw new IllegalArgumentException("authentication failed");
		}
	}

}
