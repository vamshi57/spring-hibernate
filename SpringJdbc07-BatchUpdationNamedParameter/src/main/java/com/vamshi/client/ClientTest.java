package com.vamshi.client;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.vamshi.dto.PassengerDto;
import com.vamshi.service.RegistractionService;
import com.vamshi.service.RegistractionServiceImpl;



public class ClientTest {
	public static void main(String[] args) {
		
	PassengerDto dto=null;
  ApplicationContext ctx=new ClassPathXmlApplicationContext("com/vamshi/cfg/applicationContext.xml");
  RegistractionService service=ctx.getBean("service",RegistractionServiceImpl.class);
  dto=service.getPassengerService("ram");
  System.out.println(dto.toString());
   ((AbstractApplicationContext) ctx).close();
 
	}
   
   
  
}
