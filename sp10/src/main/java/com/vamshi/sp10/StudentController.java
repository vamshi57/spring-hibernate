package com.vamshi.sp10;

import com.vamshi.object_class.StudentDTO;
import com.vamshi.object_class.StudentVO;

public class StudentController {
	private StudentService service;

	public void setService(StudentService service) {
		this.service = service;
	}
	public String process(String sno,String sname,String m1,String m2,String m3) {
		StudentVO vo=new StudentVO();
		//prepare vo object
		vo.setSno(sno);
		vo.setSname(sname);
		vo.setM3(m3);
		vo.setM2(m2);
		vo.setM1(m1);
		
		//convert vo object to DTO
		StudentDTO dto=new StudentDTO();
		dto.setSno(Integer.parseInt(vo.getSno()));
		dto.setSname(vo.getSname());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		
		//use Service class
		String result=service.generateResult(dto);
		return result;
		
		
		
	}
	public String showData(int sno) {
		return service.generateRetrive(sno);
		
	}

}
