package com.vamshi.client;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vamshi.dto.AccountDto;
import com.vamshi.service.BankService;

public class ClientTest {
	public static void main(String[] args) {
		
		BankService service=null;
  ApplicationContext ctx=new ClassPathXmlApplicationContext("com/vamshi/cfg/applicationContext.xml");
  service=ctx.getBean("service",BankService.class);
  AccountDto dto=service.getAccountByAccNoService(101);
  System.out.println(dto.toString());
  System.out.println("*****************************************************************");
  List<AccountDto> listdto=service.getAccountByBalanceRangService(150000, 200000);
  listdto.forEach(dto1->{
	  System.out.println(dto1.toString());
  
  });
  System.out.println("---------------------------------------------------------------------");
  int updatedRows=service.updateByBalanceService(5000.0f, 150000, 200000);
  
  System.out.println("updated Rows count   :"+updatedRows);
  
   ((AbstractApplicationContext) ctx).close();
 
	}
}
