package com.vamshi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.vamshi.service.DomainService;

@SpringBootApplication
public class SpringAspectJ02BasicAroundAdviceSpringbootApplication {


	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ctx=SpringApplication.run(SpringAspectJ02BasicAroundAdviceSpringbootApplication.class, args);
	    DomainService ds=ctx.getBean("ds",DomainService.class);
	    System.out.println("SpringAspectJ02BasicAroundAdviceSpringbootApplication.main()");
	    System.out.println(ds.getDomainObjectById(101L));
	    ((AbstractApplicationContext) ctx).close();
	
	}

}
