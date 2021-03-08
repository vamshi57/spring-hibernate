package com.vamshi.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegistrationServlet() {
       
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("img/jpg");
		PrintWriter out=response.getWriter();
		String uname=request.getParameter("uname");
		String upwd=request.getParameter("upwd");
		String uemail=request.getParameter("eamil");
		out.println("<html><body bgcolor='lightblue'><b><font size='7'><br><br>");
		out.println("name  "+uname+"<br><br>");
		out.println("password  "+upwd+"<br><br>");
		out.println("emali     "+uemail);
		out.println("</font></b></body></html>");
		
	}

}
