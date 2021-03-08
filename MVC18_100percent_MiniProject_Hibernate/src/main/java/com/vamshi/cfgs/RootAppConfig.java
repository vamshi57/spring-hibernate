package com.vamshi.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ServiceCfg.class,PersistanceCfg.class,AOPConfig.class})
@ComponentScan("com.vamshi.service")

public class RootAppConfig {
   
	public RootAppConfig() {
		System.out.println("RootAppConfig.RootAppConfig()");
		
		
	}
	

}
