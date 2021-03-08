package com.vamshi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
	
	 @RequestMapping("home.htm")
		public String  home() {
			return "home";
		}
	 @RequestMapping("welcome.htm")
	 public String welcome() {
		 return "welcome";
	 }

}
