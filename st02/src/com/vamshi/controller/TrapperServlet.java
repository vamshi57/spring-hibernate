package com.vamshi.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vamshi.handler.CountriesHandler;
import com.vamshi.handler.Handler;
import com.vamshi.handler.LanguagesHandler;
import com.vamshi.handler.StudentHandler;



@WebServlet
public class TrapperServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String path=null;
		Handler handler=null;
		String lvn=null;
		String target=null;
		RequestDispatcher rd=null;
		
		try {
			//Action Mananagement (Delegating to Handler classes)
			path=req.getServletPath();
			//gives  lang.do or countries.do
			System.out.println(path);
			if(path.equalsIgnoreCase("/lang.do")) {
				handler=new LanguagesHandler();
				
			}
			else if(path.equalsIgnoreCase("/countries.do")) {
				handler=new CountriesHandler();
			}
			else if(path.equalsIgnoreCase("/student.do")) {
				handler=new StudentHandler();
			}
			else {
				throw new IllegalArgumentException("invalid request url");
			}
			//invoke handler method
			
			lvn=handler.handle(req, res);
			System.out.println(lvn);
			
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			//perform view managemnt  (mapping lvn to physical jsps)
			try {
				if(lvn.equalsIgnoreCase("disp_lang"))
					target="show_languages.jsp";
				else if(lvn.equalsIgnoreCase("disp_countries"))
					target="show_countries.jsp";
				else if(lvn.equalsIgnoreCase("student_details")) {
					target="student_details.jsp";
				}
				else
					throw new IllegalArgumentException("invalid lvn");
				//forward to target page/result page
				rd=req.getRequestDispatcher(target);
				rd.forward(req, res);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}

