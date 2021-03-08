package com.vamshi.sp10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {

	public static void main(String[] args) {
	  //create ioc container
		ApplicationContext ctx= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		StudentController controller=ctx.getBean("stController",StudentController.class);
		//call method
		System.out.println(controller.process("1013", "raja", "50", "67","67"));
		System.out.println(controller.showData(1013));

	}

}
