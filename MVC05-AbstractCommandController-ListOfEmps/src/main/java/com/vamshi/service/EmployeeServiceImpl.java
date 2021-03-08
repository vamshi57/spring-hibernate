package com.vamshi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vamshi.bo.EmployeeBO;
import com.vamshi.dao.EmployeeDao;
import com.vamshi.dao.EmployeeDaoImpl;
import com.vamshi.dto.EmployeeDTO;
import com.vamshi.rbo.EmployeeRBO;
import com.vamshi.rdto.EmployeeRDTO;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao dao;
	
	public List<EmployeeRDTO> getAllEmpl(EmployeeDTO dto){
		List<EmployeeRDTO> listRDTO=new ArrayList<EmployeeRDTO>();
		List<EmployeeBO> listBO=null;
		List<EmployeeRBO> listRBO=null;
		
		EmployeeBO bo=null;
		bo=new EmployeeBO();
		BeanUtils.copyProperties(dto, bo);
		listRBO=dao.getAllDetails(bo);
		listRBO.forEach(rbo->{
			EmployeeRDTO rdto=new EmployeeRDTO();
			BeanUtils.copyProperties(rbo, rdto);
			listRDTO.add(rdto);
		});
		
		
		return listRDTO;
	
    }
}
