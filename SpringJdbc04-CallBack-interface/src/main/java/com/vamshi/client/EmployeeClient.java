package com.vamshi.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vamshi.dto.EmployeeDTO;
import com.vamshi.service.EmployeeService;
import com.vamshi.service.EmployeeServiceImpl;

public class EmployeeClient {
	public static void main(String[] args) {
     ApplicationContext ctx=new ClassPathXmlApplicationContext("com/vamshi/cfg/applicationContext.xml");
     EmployeeService service=ctx.getBean("service", EmployeeServiceImpl.class);
     EmployeeDTO dto=service.fetchEmpolyeeService(101);
     System.out.println(dto.toString());
     ((AbstractApplicationContext) ctx).close();
	}
    
}
