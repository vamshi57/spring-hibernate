package com.vamshi.pointcut;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class UserPt extends StaticMethodMatcherPointcut {
	private String methodName;
	private String clazz;

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

   public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public boolean matches(Method method, Class<?> targetClass) {
		System.out.println(method);
		System.out.println(targetClass);
		if( method.getName().equalsIgnoreCase(methodName) && targetClass.getName().equalsIgnoreCase(clazz)) {
			return true;
		}
		return false;
	}

}
