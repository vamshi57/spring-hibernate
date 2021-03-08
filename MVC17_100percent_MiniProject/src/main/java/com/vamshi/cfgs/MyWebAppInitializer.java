package com.vamshi.cfgs;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer  {

	@Override
	public  Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {RootAppConfig.class};
	}

	@Override
	public Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {WebMvcAppConfig.class};
	}

	@Override
	public  String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"*.htm"};
	}
	
}
