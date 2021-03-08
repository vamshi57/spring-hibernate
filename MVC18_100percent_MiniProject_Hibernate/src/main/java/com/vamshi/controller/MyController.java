package com.vamshi.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.vamshi.command.UserCommand;
import com.vamshi.dto.UserDTO;
import com.vamshi.service.UserService;

@Controller
public class MyController {
	@Autowired
	private UserService userService;

	@GetMapping("userform")
	public String userformlaunch(Map<String, Object> map,@ModelAttribute("userCmd")UserCommand cmd) {
		return "userform";
	}
	
	@PostMapping("userform")
	public String userformvalidation(Map<String,Object> map,@ModelAttribute("userCmd")UserCommand cmd ,BindingResult br) { 
		UserDTO dto=new UserDTO();
		System.out.println("MyController.userformvalidation()");
		System.out.println(cmd.getUsername());
		String rs=null;
		BeanUtils.copyProperties(cmd, dto);
		rs=userService.Authenticate(dto);
		map.put("rs", rs);
		
		
		return "result";
	}
	
}
