package com.vamshi.cfgs;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;


import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.vamshi.cfgs.RootAppConfig;
import com.vamshi.cfgs.WebMvcAppConfig;


public class MyWebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext sc) throws ServletException {
		//create root application contaienr
		 AnnotationConfigWebApplicationContext parentCtx=null, childCtx=null;
		ContextLoaderListener listener=null; 
		DispatcherServlet ds=null;
		ServletRegistration.Dynamic dynamic=null;
		
		//parent container
		parentCtx=new AnnotationConfigWebApplicationContext();
		parentCtx.scan("com.vamshi.cfgs");
		//parentCtx.register(RootAppConfig.class);
		
		//create listener
		listener=new ContextLoaderListener(parentCtx);
		sc.addListener(listener);
		
		
		//child container
		childCtx=new AnnotationConfigWebApplicationContext();
		childCtx.register(WebMvcAppConfig.class);
		ds=new DispatcherServlet(childCtx);
		dynamic=sc.addServlet("dispatcher", ds);
		dynamic.setLoadOnStartup(2);
        dynamic.addMapping("*.htm");		
		
		
	}
}
