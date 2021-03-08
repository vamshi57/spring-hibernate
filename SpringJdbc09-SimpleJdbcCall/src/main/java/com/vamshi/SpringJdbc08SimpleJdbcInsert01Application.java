package com.vamshi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.vamshi.service.EmployeeService;

@SpringBootApplication
public class SpringJdbc08SimpleJdbcInsert01Application {

	public static void main(String[] args) {
	 ApplicationContext ctx=null;
     ctx= SpringApplication.run(SpringJdbc08SimpleJdbcInsert01Application.class, args);
	 EmployeeService service=ctx.getBean("service",EmployeeService.class);
	 System.out.println(service.getInsertService(102));
	 
	}
	
}
