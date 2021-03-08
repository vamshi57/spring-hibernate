package com.vamshi.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vamshi.bo.UserBO;
import com.vamshi.dao.UserDao;
import com.vamshi.dto.UserDTO;

@Service
@Transactional(propagation = Propagation.REQUIRED,transactionManager = "dsTxMgr")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao dao;
	
	@Override
	public String Authenticate(UserDTO dto) {
		UserBO bo=null;
		long count=0;
		bo=new UserBO();
		BeanUtils.copyProperties(dto, bo);
		count=dao.validate(bo);
		System.out.println(count);
		
		
		return count==0?"In valid Credentials":"Valid Credentials";
	}

}
