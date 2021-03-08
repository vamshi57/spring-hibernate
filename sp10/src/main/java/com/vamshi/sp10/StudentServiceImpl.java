package com.vamshi.sp10;

import com.vamshi.object_class.StudentBO;
import com.vamshi.object_class.StudentDTO;


public class StudentServiceImpl implements StudentService{

	private  StudentDao dao;
	
	public void setDao(StudentDao dao) {
		this.dao = dao;
	}
	public String generateResult(StudentDTO dto) {
		int total=dto.getM1()+dto.getM2()+dto.getM3();
		float avg=(float)total/3.0f;
		String result=null;
		if(avg<35) {
			result="fail";
			
		}
		else {
			result="pass";
		}
		//create BO class obj
		StudentBO bo=new StudentBO();
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setTotal(total);
		bo.setAvg(avg);
		bo.setResult(result);
		// use Dao
		int cnt=dao.insert(bo);
		
		if(cnt==0) {
			return " Result  :"+bo.getResult()+"     "+bo.getSno()+"  Registration failed";
		}
		else {
			return "Result   :"+bo.getResult()+"        "+bo.getSno()+"  Registration successfull";
		}
		
	}//method
	public String generateRetrive(int sno) {
	  StudentBO bo=dao.retrive(sno);
		if(bo==null) {
			return "result :student does not ";
		}
		else {
			return bo.toString();
		}
		
	}

}//class
