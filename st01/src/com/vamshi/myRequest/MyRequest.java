package com.vamshi.myRequest;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestWrapper;

public class MyRequest extends ServletRequestWrapper {
   ServletRequest request;
	public MyRequest(ServletRequest request) {
		super(request);
		this.request=request;
	}
	@Override
	public String getParameter(String name) {
		String value=request.getParameter("name");
		if(name.equals("uemail")) {
			if(!value.endsWith("@gmail.com")) {
				value=value+"@gmail.com";
			}
			
		}
		return value;
	}

}
