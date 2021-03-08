package com.vamshi;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


@SpringBootApplication
public class Batch02SpringbootCsvToDbApplication {
	@Autowired
	private static JobLauncher launcher;
	@Autowired
	private static Job job1;
	

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(Batch02SpringbootCsvToDbApplication.class, args);
		JobExecution execution=null;
		try {
			execution=launcher.run(job1, new JobParameters());	
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		((AbstractApplicationContext) ctx).close();
		
		
		
	}

}
