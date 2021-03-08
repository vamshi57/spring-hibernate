package com.vamshi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.PagedList;
import org.springframework.social.facebook.api.Post;
import org.springframework.social.facebook.api.User;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class HelloController {
	@Autowired
	private Facebook facebook;
	@Autowired
	private ConnectionRepository repository;
	
	/*public HelloController(Facebook facebook,ConnectionRepository repository) {
		System.out.println("HelloController.HelloController()");
		this.facebook=facebook;
		System.out.println("HelloController.HelloController() after");
		this.repository=repository;
		
	}*/
	@GetMapping
	public String helloFacebook(Model model) {
		if(repository.findPrimaryConnection(Facebook.class)==null) {
			return "redirect:/connect/facebook";
		}
		
		User user=facebook.fetchObject("me", User.class);
		String name=user.getName();
		String birthday=user.getBirthday();
		String email=user.getEmail();
		String location=user.getLocation().toString();
		String hometown=user.getHometown().toString();
		String firstname=user.getFirstName();
		String lastname=user.getLastName();
		// set the  string to model 
		model.addAttribute(name);model.addAttribute(birthday);model.addAttribute(email);
		model.addAttribute(location);model.addAttribute(hometown);model.addAttribute(firstname);
		model.addAttribute(lastname);
		PagedList<Post> feed=facebook.feedOperations().getFeed();
		model.addAttribute("feed",feed);
		return "hello";
		
	}
	

}
