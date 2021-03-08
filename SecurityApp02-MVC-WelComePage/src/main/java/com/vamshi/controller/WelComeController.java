package com.vamshi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelComeController {
	
	@GetMapping("welcome.htm")
	public String welComePage() {
		return "welcome";
	}
	@RequestMapping("admin.htm")
	public String adminPage() {
		return "admin";
	}
	@RequestMapping("faculty.htm")
	public String facultyPage() {
		return "faculty";
	}
	

}
