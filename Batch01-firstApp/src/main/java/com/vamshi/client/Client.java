package com.vamshi.client;




import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Client {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		 JobLauncher launcher=null;
		 Job job1=null;
		 JobExecution execution;
		 System.out.println("before applicationcontext");
				 ctx=new ClassPathXmlApplicationContext("com/vamshi/cfg/applicationContext.xml");
				 
		//get access to launcher
	  launcher=ctx.getBean("jobLauncher",JobLauncher.class);
	  job1=ctx.getBean("job1",Job.class);
	  //excute the job
	  try {
		 execution=launcher.run(job1, new JobParameters());
		 System.out.println("status:::"+execution.getStatus());
	  }
	  catch(Exception e){
		  e.printStackTrace();
	  }
	  ((AbstractApplicationContext) ctx).close();
	  
		 
		
	}

}
