package com.vamshi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.vamshi.beans.EmployeeBO;
import com.vamshi.beans.EmployeeDTO;
import com.vamshi.dao.EmployeeDao;

public class EmployeeServiceImpl implements EmployeeService {
	private  EmployeeDao  dao;

	public EmployeeServiceImpl(EmployeeDao dao) {
		this.dao = dao;
	}

	@Override
	public List<EmployeeDTO> fetchAllEmps() {
		List<EmployeeBO> listBO=null;
		List<EmployeeDTO> listDTO=new ArrayList<EmployeeDTO>();
		//use DAO
		listBO=dao.getAllEmps();
		//convert listBO to listDTO
		for(EmployeeBO bo: listBO ) {
			EmployeeDTO dto=new EmployeeDTO();
			BeanUtils.copyProperties(bo,dto);
			dto.setSrno(listDTO.size()+1);
			listDTO.add(dto);
			System.out.println(dto.getEid());
		}
		
		return listDTO;
	}//method

}
