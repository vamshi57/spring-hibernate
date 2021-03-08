package com.vamshi.beans;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component("irr")
@PropertySource("com/vamshi/commons/cfg.properties")
public class InterestReplace implements MethodReplacer {
	@Value("${value}")
	private float rate;
	
	public InterestReplace() {
		System.out.println("InterestReplace.InterestReplace()");
	}
	public void setRate(float rate) {
		this.rate = rate;
	}

	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		float time=0.0f;		
		float amount=0.0f;
		time=(Float)args[0];
	    amount=(Float)args[1];
		 float total=(time*amount*rate);
		 System.out.println(total);
		 System.out.println(obj.getClass()+"  "+method.getName()+"  "+Arrays.deepToString(args));
		 System.out.println(obj.getClass().getSuperclass());
		 return total;
	}

}
