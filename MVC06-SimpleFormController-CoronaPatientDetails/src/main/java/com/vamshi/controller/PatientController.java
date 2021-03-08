package com.vamshi.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vamshi.command.PatientCommand;
import com.vamshi.dto.PatientDTO;
import com.vamshi.service.PatientService;
@Controller
//@RestController
public class PatientController {
	@Autowired
	PatientService service;
	
	@GetMapping("/corona.htm")
	public String showForm(@ModelAttribute("patCmd") PatientCommand cmd) {
		cmd.setHospital("gandhi");cmd.setLocation("hyd");
		return "registration_form";	
	}
	@PostMapping("/corona.htm")
	public String processForm(Map<String, Object> map,@ModelAttribute("patCmd") PatientCommand cmd,BindingResult rs){
		
		PatientDTO dto=new PatientDTO();
		BeanUtils.copyProperties(cmd, dto);
		map.put("result", service.fetch(dto));
		return "show_result";
		
	}
		
	}