package com.vamshi.interceptor;

import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * @author vvkvr
 *
 */
public class TimeCheckInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)
			throws Exception {
		Calendar cl=Calendar.getInstance();
		int hour=cl.get(Calendar.HOUR_OF_DAY);
		if(hour>9 && hour<17){
			RequestDispatcher rd=req.getRequestDispatcher("timeout.jsp");
			rd.forward(req, res);
		 
		   return false;
		}
		else {
			
		return true;
		}
	}
	
	

}
