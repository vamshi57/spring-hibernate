package com.vamshi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.vamshi.service.Service;
import com.vamshi.service.ServiceImpl;

@SpringBootApplication
public class SpringJdbc02SpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Service service=null;
		ctx=SpringApplication.run(SpringJdbc02SpringBootApplication.class, args);
	    service=ctx.getBean("service", ServiceImpl.class);
	    int count=service.getEmpCount();
		System.out.println(count);
	}

}
