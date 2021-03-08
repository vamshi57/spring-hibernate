package com.vamshi.controller;

import java.util.List;
import java.util.Map;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.vamshi.beans.EmployeeDTO;
import com.vamshi.service.EmployeeService;



@Controller
public class EmployeeCotroller {
	@Autowired
	private EmployeeService service;
	
	@RequestMapping("/home")
	public String showHome() {
		return "home";
	}
	
	
	
	@RequestMapping("/list_emps")
	public String showEmps(Map<String, Object> map) {
		List<EmployeeDTO> listDTO=null;
		//use service
		listDTO=service.fetchAllEmps();
		map.put("listDTO",listDTO);
		for(EmployeeDTO dt:listDTO) {
		System.out.println(dt.getEname());
		}
		
				return "show_emps";
		
	}

}
