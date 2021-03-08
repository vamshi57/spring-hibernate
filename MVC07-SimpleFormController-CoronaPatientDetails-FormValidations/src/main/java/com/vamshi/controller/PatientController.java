package com.vamshi.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


import com.vamshi.command.PatientCommand;
import com.vamshi.dto.PatientDTO;
import com.vamshi.service.PatientService;
import com.vamshi.validator.PatientValidator;

@Controller
@SessionAttributes("patCmd")
public class PatientController {
	@Autowired
	PatientService service;
	
	 @Autowired
	 PatientValidator validator;
	 
	
	  @ModelAttribute("patCmd") 
	public PatientCommand getPatientCommand() {
	  System.out.println("PatientController.getPatientCommand()"); 
	  return new PatientCommand(); 
	  }
	  
	  
	@GetMapping("/corona.htm")
	public String showForm(@ModelAttribute("patCmd")PatientCommand cmd) {
		cmd.setHospital("gandhi");cmd.setLocation("hyd");
		return "registration_form";	
	}
	
	@PostMapping("/corona.htm")
	public String processForm(Map<String, Object> map,HttpSession sess,@ModelAttribute("patCmd") PatientCommand cmd,BindingResult br){
		
           if(validator.supports(PatientCommand.class)) {
        	   validator.validate(cmd, br);
			if(br.hasErrors()) {
				return "registration_form";
			}
		}
		
		PatientDTO dto=new PatientDTO();
		BeanUtils.copyProperties(cmd, dto);
		String result=service.fetch(dto);
		map.put("result", result);
		sess.setAttribute("result", result);
		return "redirect:/result.htm";//PRDG(post redirect getmapping
	}
	@GetMapping("/result.htm")
	public String showResult() {
		return "show_result";
	}
}