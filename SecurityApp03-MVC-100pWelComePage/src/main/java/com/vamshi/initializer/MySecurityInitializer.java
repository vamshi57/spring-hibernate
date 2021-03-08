package com.vamshi.initializer;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class MySecurityInitializer extends AbstractSecurityWebApplicationInitializer{
  public static void init() {
	 System.out.println("mysecurity");
   }
}
