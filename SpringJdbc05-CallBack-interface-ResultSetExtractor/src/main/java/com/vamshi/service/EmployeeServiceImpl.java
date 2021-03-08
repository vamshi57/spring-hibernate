package com.vamshi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vamshi.bo.EmployeeBO;
import com.vamshi.dao.EmployeeDao;
import com.vamshi.dto.EmployeeDTO;
@Service("service")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
    private EmployeeDao dao;
	

	public List<EmployeeDTO> fetchEmpolyeeService(String eaddr) {
	    List<EmployeeBO> listbo=dao.fetchEmo(eaddr);
	    List<EmployeeDTO>	listdto=new ArrayList<>();
	    listbo.forEach(bo->{
	    EmployeeDTO dto=new EmployeeDTO();
	    BeanUtils.copyProperties(bo,dto);
	    listdto.add(dto);
	    });
		return listdto;
	}

}
