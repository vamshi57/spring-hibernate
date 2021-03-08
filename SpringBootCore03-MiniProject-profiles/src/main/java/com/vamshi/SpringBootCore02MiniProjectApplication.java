package com.vamshi;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import org.springframework.core.env.Environment;
import org.springframework.core.env.StandardEnvironment;

import com.vamshi.controller.StudentController;
import com.vamshi.entities.VO;



@SpringBootApplication
public class SpringBootCore02MiniProjectApplication {
	@Autowired
	static Environment evn=new StandardEnvironment();
 
	public static void main(String[] args)throws Exception{
		VO vo=new VO();
		 ApplicationContext ctx;
		ctx=SpringApplication.run(SpringBootCore02MiniProjectApplication.class, args);
       StudentController controller=ctx.getBean("controller",StudentController.class);
       vo.setMark1("100");vo.setMark2("80");vo.setMark3("90");vo.setSname("vamshi");
       controller.insert(vo);
       
       System.out.println("va,shk");
       
       System.out.println(evn.getProperty("edition"));
       System.out.println(evn.getProperty("version"));
       
	}
	
	

  
}
