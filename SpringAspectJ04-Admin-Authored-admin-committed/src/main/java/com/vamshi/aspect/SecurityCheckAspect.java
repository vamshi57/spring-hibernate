package com.vamshi.aspect;

import org.aspectj.lang.JoinPoint;

import com.vamshi.manager.AuthenticationManager;

public class SecurityCheckAspect {
	private AuthenticationManager manager;
	
	public SecurityCheckAspect(AuthenticationManager manager) {
		this.manager=manager;
	}
	//before advice method
	public void check(JoinPoint jp)throws Throwable{
		if(!manager.isAuthenticated()) {
			throw new IllegalArgumentException("authentication failed");
		}
	}

}
