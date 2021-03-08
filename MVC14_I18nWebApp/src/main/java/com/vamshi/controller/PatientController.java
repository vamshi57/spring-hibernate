package com.vamshi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vamshi.command.PatientCommand;

@Controller
public class PatientController {
	
	@RequestMapping("/registration.htm")
	public String showForm(@ModelAttribute("patCmd")PatientCommand cmd ) {
		return "patient_registration";
		
	}

}
