package com.vamshi.initializer;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.vamshi.cfgs.RootAppConfig;
import com.vamshi.cfgs.WebMvcAppConfig;
@Configuration

public class MyWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("rootConfig");
		
		return new Class[] {RootAppConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[] {WebMvcAppConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[] {"*.htm"};
	}

}
