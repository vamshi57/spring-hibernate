package com.vamshi.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.vamshi.beans.EmployeeDTO;
import com.vamshi.service.EmployeeService;

public class EmployeeCotroller extends AbstractController {
	private EmployeeService service;
	
	public EmployeeCotroller(EmployeeService service) {
		this.service = service;
	}
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<EmployeeDTO> listDTO=null;
		//use service
		listDTO=service.fetchAllEmps();
		System.out.println("EmployeeCotroller.handleRequestInternal()");
		for(EmployeeDTO li:listDTO) {
			System.out.println(li.getEname());
			
		}
		//return MAV
				return new ModelAndView("show_emps", "listDTO", listDTO);
		
	}


}
