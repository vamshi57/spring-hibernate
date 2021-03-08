package com.vamshi.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vamshi.command.PagingCommand;
import com.vamshi.dto.EmployeeDTO;
import com.vamshi.service.EmployeeService;

@Controller("empController")
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@GetMapping("page.htm")
	public String showHome(@ModelAttribute("pageCmd") PagingCommand cmd,HttpServletRequest req) {
		HttpSession ses=null;
        cmd.setPagesize(3);	
        // access the Session
     ses=req.getSession(true);
		ses.removeAttribute("pageSize");
		return "page_form";
	}
	
	@RequestMapping("report.htm")
	public String showReport(Map<String , Object> map,@ModelAttribute("pageCmd") PagingCommand cmd,HttpServletRequest req)throws Exception {
		HttpSession ses=null;
		int pageSize=0;
		int pageNo=0;
		int pagesCount=0;
		List<EmployeeDTO> listDTO=null;
		ses=req.getSession(true);
		
		
		if(ses.getAttribute("pageSize")!=null) {
			pageSize=(int)ses.getAttribute("pageSize");
		}
		else {
			pageSize=cmd.getPagesize();
			ses.setAttribute("pageSize", pageSize);
		}
		
		pageNo=Integer.parseInt(req.getParameter("pageNo"))-1;
		pagesCount=service.getPagesCount(pageSize);
		listDTO=service.getPageData(pageNo, pageSize);
		//keep results in model attribte
		map.put("pagesCount",pagesCount);
		map.put("listDTO",listDTO);
		
		//return lvn
		
		return "show_report";
	}

}
