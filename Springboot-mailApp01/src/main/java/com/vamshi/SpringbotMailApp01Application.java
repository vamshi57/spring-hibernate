package com.vamshi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.vamshi.service.PurchaseService;
import com.vamshi.service.PurchaseServiceImpl;

@SpringBootApplication
public class SpringbotMailApp01Application {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		PurchaseService service=null;
		String msg=null;
		//get ioc container 
		ctx=SpringApplication.run(SpringbotMailApp01Application.class, args);
	   service=ctx.getBean("purchaseService",PurchaseServiceImpl.class);
	   try {
	          msg=service.purchase(new String[]{"shirt","trouser" }, new float[] {1000f,3000f}, "vamshikrishnavadlakonda@gmail.com");
	          System.out.println("after perchase");
	   }catch(Exception e) {
		   e.printStackTrace();  
	   }
	   ((ConfigurableApplicationContext) ctx).close();
	
	}

}
