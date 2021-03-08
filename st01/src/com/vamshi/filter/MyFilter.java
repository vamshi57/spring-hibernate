package com.vamshi.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import com.vamshi.myRequest.MyRequest;

@WebFilter("/reg")
public class MyFilter implements Filter {
	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		ServletRequest hreq = (ServletRequest)request;
		MyRequest mreq = new MyRequest(hreq);
		
		chain.doFilter(request, response);
		
	}

	public void init(FilterConfig fconfig)throws ServletException{
		
	}
	

}
