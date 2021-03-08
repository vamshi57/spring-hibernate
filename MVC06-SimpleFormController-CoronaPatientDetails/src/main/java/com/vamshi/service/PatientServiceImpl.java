package com.vamshi.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vamshi.bo.patientBO;
import com.vamshi.dao.PatientDao;
import com.vamshi.dto.PatientDTO;

@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
	private PatientDao dao;
	
	public String fetch(PatientDTO dto) {
		int count=0;
		patientBO bo=new patientBO();
		BeanUtils.copyProperties(dto, bo);
		count=dao.insert(bo);
		return count==0?"Patient Registration Failed":"Patient Registraion succeded";
	}

}
