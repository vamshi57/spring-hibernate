package com.vamshi.manager;

import org.springframework.beans.BeanUtils;

import com.vamshi.bo.UserDetailsBo;
import com.vamshi.dao.AuthenticationDao;
import com.vamshi.dto.UserDetailsDto;

public class AuthenticationManager{
	private AuthenticationDao dao;
	
	private ThreadLocal<UserDetailsDto> threadLocal=new ThreadLocal<>();
	
	private AuthenticationManager(AuthenticationDao dao) {
		this.dao=dao;
	}
	public void signIn(String username,String pwd) {
		UserDetailsDto dto =null;
		dto=new UserDetailsDto();
		dto.setUsername(username);
		dto.setPwd(pwd);
		threadLocal.set(dto);
	}
	public void signOut() {
		threadLocal.remove();
	}
    public boolean isAuthenticated() {
    	UserDetailsDto dto=null;
    	UserDetailsBo bo=null;
    	int count=0;
    	dto=threadLocal.get();
    	bo=new UserDetailsBo();
    	BeanUtils.copyProperties(dto, bo);
    	count=dao.validate(bo);
    	return count==0? false:true;
    }
}
