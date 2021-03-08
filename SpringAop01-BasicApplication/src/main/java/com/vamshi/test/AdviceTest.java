package com.vamshi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vamshi.service.InterestCalc;


@SuppressWarnings("unused")
public class AdviceTest {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/vamshi/cfg/applicationContext.xml");
		InterestCalc interest=ctx.getBean("proxy",InterestCalc.class);
		System.out.println(interest.getClass());
		 
		
		
		System.out.println(interest.simpleInterest(10000.0f, 12, 12));
		System.out.println(interest.simpleInterest(10000.0f, 12, 12));
		((AbstractApplicationContext) ctx).close();
		
	}

}
