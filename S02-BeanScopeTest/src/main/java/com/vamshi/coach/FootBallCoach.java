package com.vamshi.coach;

public class FootBallCoach implements Coach {
	public void play() {
		System.out.println("i am playing football");
	}
	//init-method
	public void start() {
		System.out.println("start play");
	}
	//destroy method
	public void stop() {
		System.out.println("stop play");
	}

}
