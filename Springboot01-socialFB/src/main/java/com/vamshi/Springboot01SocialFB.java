package com.vamshi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.vamshi.controller")
public class Springboot01SocialFB {

	public static void main(String[] args) {
		SpringApplication.run(Springboot01SocialFB.class, args);
	}

}
