package com.vamshi.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.vamshi.beans.EmployeeCommand;
import com.vamshi.beans.EmployeeDTO;
import com.vamshi.service.EmployeeService;



@Controller
@SessionAttributes("EmpCmd")
public class EmployeeCotroller {
	@Autowired
	private EmployeeService service;
	
	@ModelAttribute("EmpCmd")
	public EmployeeCommand getEmpCmd() {
		return new EmployeeCommand();	
	}
	
	
	
	
	@RequestMapping("/home.htm")
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
	@GetMapping("/update.htm")
	public String update(@RequestParam("eid") int eid, @ModelAttribute("EmpCmd")EmployeeCommand cmd )  {
		EmployeeDTO dto=null;
		//use service
		dto=service.fetchEmpById(eid);
		BeanUtils.copyProperties(dto, cmd);
		
		return "update_form";
	}
	@PostMapping("/update.htm")
	public String update1(Map<String,Object> map, @ModelAttribute("EmpCmd") EmployeeCommand cmd ,BindingResult br) {
		List<EmployeeDTO> listDTO=null;
		EmployeeDTO dto=new EmployeeDTO();
		
		
		BeanUtils.copyProperties(cmd, dto);
		System.out.println("EmployeeCotroller.update1()"+cmd.getEid());
		String result=service.updateEmpServe(dto);
		
		listDTO=service.fetchAllEmps();
		map.put("result", result);
		map.put("listDTO", listDTO);
		return "update_result";
	}
	
	@GetMapping("/delete.htm")
	public String delectEmpController( @RequestParam("eid") int eid ,Map<String,Object> map) {
		String result=service.deleteEmpService(eid);
		map.put("delete_rs", result);
		return "delete_result";
	}
	

}
