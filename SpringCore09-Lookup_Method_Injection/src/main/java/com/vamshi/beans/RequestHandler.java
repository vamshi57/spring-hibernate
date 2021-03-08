package com.vamshi.beans;

public class RequestHandler {
	private static int count;
	public void RequestHandler(){
		count++;
		System.out.println("RequestHandler::0-param constructor");
	}
	public void handler(String data) {
		System.out.println("RequestHandler"+count+"with data "+data);
	}

}
