package com.vamshi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomeController {
	
	@RequestMapping("/home.htm")
	public String showHome() {
		System.out.println("ShowHomeController.showHome()");
		return "homepage";
	}
	

}
