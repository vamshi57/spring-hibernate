package com.vamshi.beans;

public abstract class MyServletContainer {
	public MyServletContainer() {
		System.out.println("MySevletContainer::0-param constructor");
	}
	public void processRequest(String data) {
		//get dependent beean
		RequestHandler handler=getRequestHandler();
		handler.handler(data);
	}
	public abstract RequestHandler getRequestHandler();
	

}
