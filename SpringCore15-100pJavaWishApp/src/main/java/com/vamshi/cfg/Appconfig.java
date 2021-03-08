package com.vamshi.cfg;


import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = "com.vamshi.beans")
public class Appconfig {
	
	public Appconfig() {
		System.out.println("AppConfig-0 arg constructor");
	}
	
	
	@Bean(name="cl")
	public Calendar createCalender() {
		System.out.println("Appconfig.createCalender()");
		return Calendar.getInstance();
	}

}
