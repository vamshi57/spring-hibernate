package com.vamshi.client;

import java.util.List;
import java.util.stream.Collector;

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
    List<EmployeeDTO> listdto=service.fetchEmpolyeeService("hyd");
		/*listdto.forEach(
			System.out::println
		);*/
    listdto.stream().filter((dto1)->dto1.getEno()>=102).forEach(System.out::println);
     ((AbstractApplicationContext) ctx).close();
	}
    
}
