package com.vamshi.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vamshi.dao.StudentDao;
import com.vamshi.entities.BO;
import com.vamshi.entities.DTO;
@Component()
public class StudentServiceImpl implements StudentService {
     @Autowired
	private StudentDao dao;
	
	
  @Override
  public void insertIt(BO bo) throws Exception {
	DTO dto=new DTO();
	BeanUtils.copyProperties(bo, dto);
	dao.insertInTo(dto);
     }
}
