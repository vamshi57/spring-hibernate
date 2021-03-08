package com.vamshi.dto;

public class UserDetailsDto {
	private String username;
	private String pwd;
	
	public UserDetailsDto() {
		
	}
	public UserDetailsDto(String username, String pwd) {
	
		this.username = username;
		this.pwd = pwd;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "UserDetailsDto [username=" + username + ", pwd=" + pwd + "]";
	}
	
	
	
	

}
