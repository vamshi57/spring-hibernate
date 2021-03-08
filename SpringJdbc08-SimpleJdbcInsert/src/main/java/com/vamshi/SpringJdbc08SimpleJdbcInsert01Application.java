package com.vamshi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.vamshi.dto.EmployeeDto;
import com.vamshi.service.EmployeeService;

@SpringBootApplication
public class SpringJdbc08SimpleJdbcInsert01Application {

	public static void main(String[] args) {
	 ApplicationContext ctx=null;
     ctx= SpringApplication.run(SpringJdbc08SimpleJdbcInsert01Application.class, args);
	 EmployeeService service=ctx.getBean("service",EmployeeService.class);
	 EmployeeDto dto=new EmployeeDto(201, "vamshi", 10000.0f, "hyd");
	 System.out.println(service.getInsertService(dto));
	}
	
}
