package com.vamshi.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentHandler implements Handler {

	@Override
	public String handle(HttpServletRequest req, HttpServletResponse res) throws Exception {
		int sno=1010;
		String sname="vamshikrishna";
		String saddr="hyd";
		req.setAttribute("sno", sno);
		req.setAttribute("sname", sname);
		req.setAttribute("saddr", saddr);
		
		return "student_details";
	}

}
