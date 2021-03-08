package com.vamshi.client;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.vamshi.beans.WishApp;
import com.vamshi.cfg.Appconfig;

public class ClientApp {
	public static void main(String[] args) {
		
	
	ApplicationContext ctx=new AnnotationConfigApplicationContext(Appconfig.class);
	WishApp wishApp=ctx.getBean("wish",WishApp.class);
	
	wishApp.getWish();
	
	((AbstractApplicationContext) ctx).close();
	}
}
