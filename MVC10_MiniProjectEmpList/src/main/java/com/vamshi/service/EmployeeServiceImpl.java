package com.vamshi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vamshi.beans.EmployeeBO;
import com.vamshi.beans.EmployeeDTO;
import com.vamshi.dao.EmployeeDao;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private  EmployeeDao  dao;

	

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
	
	@Override
	public EmployeeDTO fetchEmpById(int eid) {
		EmployeeDTO dto=new EmployeeDTO();
		EmployeeBO bo=dao.getEmpById(eid);
		System.out.println("EmployeeServiceImpl.fetchEmpById()");
		BeanUtils.copyProperties(bo, dto);
		
		return dto;
	}
	public String updateEmpServe(EmployeeDTO dto) {
		EmployeeBO bo=new EmployeeBO();
		BeanUtils.copyProperties(dto, bo);
		int count=dao.updateEmp(bo);
		System.out.println(count);
		
		return count==0? "Updation failed ":"Updation succeded ";
	}
	
	public String deleteEmpService(int eid) {
		int count=dao.deleteEmpByEid(eid);
		return (count==1)?" deletionsuccessfull":"deletionfailure";
	}

}
