package com.vamshi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TilesController {
	
	@RequestMapping("/home.htm")
	public  String showHome() {
		return "homeDef";
	}
	
	@RequestMapping("/courses.htm")
	public  String showCourses() {
		return "coursesDef";
	}
	
	@RequestMapping("/faculty.htm")
	public  String showFaculties() {
		return "facultyDef";
	}
}
