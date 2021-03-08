package com.vamshi.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.vamshi.cmd.PersonCommand;
import com.vamshi.validation.PersonCommandValidator;



@Controller
class PersonController {
	@Autowired
	private PersonCommandValidator pcv;
	
	
	@InitBinder
	public  void  myBinder(ServletRequestDataBinder binder) {
		System.out.println("PersonProfileController.myBinder()");
		SimpleDateFormat sdf=null;
		sdf=new SimpleDateFormat("dd-MM-yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
		
	}
	
	
	
	@ModelAttribute("genderList")
	public List<String> populategender(){
		List<String> list=new ArrayList<String>();
		list.add("male");list.add("female");
		return list;
	}
	@ModelAttribute("hobiesList")
	public List<String> populateHobies(){
	 List<String> list=new ArrayList<String>();
	 list.add("watchingTV");list.add("meditation");list.add("playingGames");
	 list.add("SingingSongs");
		return list;
		
	}
	@ModelAttribute("coursesList")
	public List<String > populateCourses(){
		List<String> list=new ArrayList<String>();
		list.add("java");list.add("oracle");list.add("python");
		list.add("spring");
		
		return list;
		}
	@ModelAttribute("qlfList")
	public List<String > populateQlf(){
		List<String> list=new ArrayList<String>();
		list.add("BTECh/BE");list.add("DEGREE");list.add("MBBS");
		list.add("MBA");
		
		return list;
		}
	@GetMapping("/person_registration.htm")
	
	public String personRegistration(@ModelAttribute("perCmd")PersonCommand cmd) {
		System.out.println("PersonController.personRegistration()");
		
		return "person_registration";
	}
	@PostMapping("/person_registration.htm")
	public String personRegistration1(Map<String,Object> map,@ModelAttribute("perCmd")PersonCommand cmd,BindingResult br ) {
		if(pcv.supports(PersonCommand.class)){
			pcv.validate(cmd, br);
			if(br.hasErrors()) {
				System.out.println("PersonController.personRegistration1() haserrior");
				return "person_registration";
			}
			map.put("cmd", cmd);
			
				
			}
		return "person_result";
	}

}
