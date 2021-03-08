package com.vamshi.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.vamshi.service")

public class RootAppConfig {
   
	public RootAppConfig() {
		System.out.println("RootAppConfig.RootAppConfig()");
	}
	

}
