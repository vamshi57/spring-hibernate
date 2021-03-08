package com.vamshi.test;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		Locale locale=new Locale("de","DE");
	String no=null,name=null,add=null;
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	no=ctx.getMessage("sno.label", new Object[] {}, "msg1", locale);
    System.out.println(no);
	}

}
