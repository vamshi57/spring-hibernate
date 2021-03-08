package com.vamshi.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;


import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.vamshi.command.PersonCommand;

@Controller
public class PersonController {
	
	@GetMapping("upload.htm")
	public String uploadForm(@ModelAttribute("pCmd")PersonCommand cmd)
	{
		return "file_upload";
	}
	@PostMapping("upload.htm")
	public String uploadForm1(@ModelAttribute("pCmd")PersonCommand cmd, Map<String ,Object> map,HttpServletRequest req,BindingResult rs)throws Exception
	{
		
		InputStream ris=null;
		InputStream pis=null;
		OutputStream ros=null,pos=null;
		File file=null;
		String rname=null;
		String pname=null;
		ServletContext ctx=null;
		String location=null;
		//get servlet context 
		ctx=req.getServletContext();
		//get contextparam
		System.out.println("before getinitparam");
		location=ctx.getInitParameter("uploadFloder");
		//create file
		file=new File(location);
		System.out.println("after newwfile");
		if(!file.exists()) 
			file.mkdir();
		rname=cmd.getResume().getOriginalFilename();
		pname=cmd.getPhoto().getOriginalFilename();
		ris=cmd.getResume().getInputStream();
		pis=cmd.getPhoto().getInputStream();
		
		ros=new FileOutputStream(location+"/"+rname);
		pos=new FileOutputStream(location+"/"+pname);
		IOUtils.copy(ris, ros);
		IOUtils.copy(pis, pos);
		ris.close();pis.close();ros.close();pos.close();
		map.put("rname", rname);
		map.put("pname", pname);
		
		return "successful_upload";
		
	}

}
