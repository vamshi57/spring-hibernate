package com.vamshi.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vamshi.service.Service;
@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	private Service service;
	
	@RequestMapping("home.htm")
	public String homePage() {
		return "home";
	}
	@RequestMapping("india.htm")
	public String  showscore(Map<String ,Object> map) {
		map.put("score",service.fetchScore("india"));
		
		
		
		return "indiascore";
	}

}
