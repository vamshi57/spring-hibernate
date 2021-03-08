package com.vamshi.client;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vamshi.bo.PassengerBo;
import com.vamshi.dto.PassengerDto;
import com.vamshi.service.RegistractionService;
import com.vamshi.service.RegistractionServiceImpl;



public class ClientTest {
	public static void main(String[] args) {
		
	
  ApplicationContext ctx=new ClassPathXmlApplicationContext("com/vamshi/cfg/applicationContext.xml");
   Scanner sc= new Scanner(System.in);
   List<PassengerDto> listDto=new ArrayList();
   PassengerDto Dto1=new PassengerDto("vamshi", "hyd", "delhi", 10000);
   PassengerDto Dto2=new PassengerDto("ram", "hyd", "delhi", 20000);
   PassengerDto Dto3=new PassengerDto("siva", "hyd", "delhi", 230000);
   
   listDto.add(Dto1);
   listDto.add(Dto2);
   listDto.add(Dto3);
   RegistractionService service=ctx.getBean("service",RegistractionServiceImpl.class);
   String result=service.batchinsert(listDto);
   System.out.println(result);
   ((AbstractApplicationContext) ctx).close();
 
	}
   
   
  
}
