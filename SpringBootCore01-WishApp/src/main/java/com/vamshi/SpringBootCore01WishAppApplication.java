package com.vamshi;


import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.vamshi.beans.WishApp;


@SpringBootApplication
public class SpringBootCore01WishAppApplication{
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ctx=SpringApplication.run(SpringBootCore01WishAppApplication.class, args);
		WishApp wishapp=ctx.getBean(WishApp.class);
		wishapp.getWish();
		((ConfigurableApplicationContext) ctx).close();
	}
	
	
   @Bean(name="cl")
	public Calendar createCalender() {
		System.out.println("Appconfig.createCalender()");
		return Calendar.getInstance();
	}
  
}
