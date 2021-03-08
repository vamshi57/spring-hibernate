package com.vamshi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShowHomeController {
	
	@RequestMapping("/home.htm")
	public String showHome() {
		System.out.println("ShowHomeController.showHome()");
		return "homepage";
	}
	@ExceptionHandler(Exception.class)
	public ModelAndView exHandler() {
		return new ModelAndView("exception");
	}
	

}
