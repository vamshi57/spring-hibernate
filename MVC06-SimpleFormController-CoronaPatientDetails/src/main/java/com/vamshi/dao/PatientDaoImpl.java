package com.vamshi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.vamshi.bo.patientBO;

@Repository
public class PatientDaoImpl implements PatientDao {
	@Autowired
	private JdbcTemplate jt;
	private static final String PATIENT_REGISTRATION="INSERT INTO CORONA_PATIENT VALUES(ID_SEQ.NEXTVAL,?,?,?,?)";
	@Override
	public int insert(patientBO bo) {
		int count=0;
		count=jt.update(PATIENT_REGISTRATION,bo.getName(),bo.getAge(),bo.getLocation(),bo.getHospital());
		
		return count;
		
	}
	

}
