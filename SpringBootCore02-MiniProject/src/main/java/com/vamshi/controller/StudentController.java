package com.vamshi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.vamshi.entities.BO;
import com.vamshi.entities.VO;
import com.vamshi.service.StudentService;
@Component("controller")
public class StudentController {
	@Autowired
    private StudentService service;
	
	public void insert(VO vo)throws Exception    
	
	{
		BO bo=new BO();
		bo.setSname(vo.getSname());bo.setMark1(Integer.parseInt(vo.getMark1()));
		bo.setMark2(Integer.parseInt(vo.getMark2()));
		bo.setMark3(Integer.parseInt(vo.getMark3()));
		System.out.println("StudentController.insert()");
		System.out.println("bo"+bo+"service");
		service.insertIt(bo);
		
	
	}
    
}
