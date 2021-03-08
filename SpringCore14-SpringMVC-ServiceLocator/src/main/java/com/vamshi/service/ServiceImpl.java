package com.vamshi.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.vamshi.external.External;


@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
	@Autowired
	private External ex;

	@Override
	public String fetchScore(String s){
		return ex.getCode(s);
	}

}
