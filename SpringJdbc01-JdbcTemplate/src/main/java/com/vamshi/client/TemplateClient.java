package com.vamshi.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vamshi.jdbcTemplate.Service;
import com.vamshi.jdbcTemplate.ServiceImpl;

public class TemplateClient {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/vamshi/cfg/applicationContext.xml");
		Service service=ctx.getBean("service", ServiceImpl.class);
		int count=service.getEmpCount();
		System.out.println(count);
		
	}

}
