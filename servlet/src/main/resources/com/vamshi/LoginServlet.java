package com.vamshi;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/log")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String upwd=request.getParameter("upwd");
		RequestDispatcher rd=null;
		if(uname.equals("vamshi")&&upwd.equals("vamshi"))){
			rd=request.getRequestDispatcher("success.html");
		}
		else {
			System.out.println("failure");
		}
	}

}
