package com.vamshi.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan("com.vamshi.controller")
public class WebMvcAppConfig {
	
	 public WebMvcAppConfig() {
		System.out.println("WebMvcAppConfig.WebMvcAppConfig()");
	}
	
	@Bean
	public ViewResolver createResolver() {
		InternalResourceViewResolver ivr=null;
		ivr=new InternalResourceViewResolver();
		ivr.setPrefix("/WEB-INF/pages/");
		ivr.setSuffix(".jsp");
		return ivr;
	}
	
	
	

}
