package com.vamshi.jdbcTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("service")
public class ServiceImpl implements Service {
	@Autowired
	private Dao dao;

	public int getEmpCount() {
		int count=dao.getEmpNo();
		return count;
	}

}
