package com.vamshi.controller;



  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.stereotype.Controller; 
  import org.springframework.web.bind.annotation.RequestMapping;
  import com.vamshi.service.Service;
  
  @Controller public class HomeController {
  
  @Autowired 
  private Service service;
  
  @RequestMapping("home.htm")
  public String home() { 
	  return "home";
  }
 
	
	
	  @RequestMapping("welcome.htm") 
	  public String welcome() {
	  
	  return "welcome to"+service.getUserName();
	  } 

}