package com.vamshi.sp08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) { 
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		MedicalShop medical=null;
		Tablet tablets=null;
		medical=context.getBean("medical",MedicalShop.class);
		tablets=context.getBean("tablet",Tablet.class);
		System.out.println(medical.toString());
	}
}
