package com.vamshi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelComeController {
	
	@GetMapping("welcome.htm")
	public String welComePage() {
		return "welcome";
	}

}
