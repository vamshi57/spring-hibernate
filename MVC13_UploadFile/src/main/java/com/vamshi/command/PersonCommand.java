package com.vamshi.command;

import org.springframework.web.multipart.MultipartFile;

public class PersonCommand {
	private String name;
	private MultipartFile resume;
	private MultipartFile photo;
	
	public void setName(String name) {
		System.out.println("PersonCommand.setName()");
		
		this.name = name;
	}
	public void setResume(MultipartFile resume) {
		System.out.println("PersonCommand.setResume()");
		this.resume = resume;
	}
	public void setPhoto(MultipartFile photo) {
		this.photo = photo;
	}
	public String getName() {
		return name;
	}
	public MultipartFile getResume() {
		return resume;
	}
	public MultipartFile getPhoto() {
		return photo;
	}
	

}
