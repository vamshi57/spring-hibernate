package com.vamshi.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vamshi.command.EmployeeCmd;
import com.vamshi.dto.EmployeeDTO;
import com.vamshi.rdto.EmployeeRDTO;
import com.vamshi.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@RequestMapping("/home.htm")
	public String home() {
		return "home";
	}
	
	
	
	
	@RequestMapping("/emp_list.htm")
	public String employeeList(Map<String ,Object> map,@ModelAttribute EmployeeCmd cmd,BindingResult rs) {
		List<EmployeeRDTO> listRDTO=null;
		EmployeeDTO dto=new EmployeeDTO();
		
		BeanUtils.copyProperties(cmd, dto);
		listRDTO=service.getAllEmpl(dto);
		
		map.put("listRDTO",listRDTO );

		return "result_emp";
	}

}
