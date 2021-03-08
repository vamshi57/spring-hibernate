package com.vamshi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vamshi.dao.Dao;


@Component("service")
public class ServiceImpl implements Service {
	@Autowired
	private Dao dao;

	public int getEmpCount() {
		int count=dao.getEmpNo();
		return count;
	}

}
