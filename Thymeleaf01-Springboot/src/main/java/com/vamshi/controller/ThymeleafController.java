package com.vamshi.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.vamshi.entity.Employee;

@Controller
public class ThymeleafController {
	List<Employee> listEmp=new ArrayList<>();
   @GetMapping("/hello.htm")
   public String getThymeleaf(Model model){
	   model.addAttribute("date", new Date());
	  
	   Employee emp1=new Employee(101, "vamshi", 10000.0f, "hyd");
	   Employee emp2=new Employee(102, "ram", 20000.0f, "hyd");
	   Employee emp3=new Employee(103, "sai", 30000.0f, "hyd");
	   listEmp.add(emp1);listEmp.add(emp2);listEmp.add(emp3);
	   model.addAttribute("emp",listEmp);
	   
	   return "hello";
   }
}
