package com.vamshi.proxy;

public class RealInternate implements Internate {
	public RealInternate(){
		System.out.println("real internate");
	}
	@Override
	public void connectTo(String s) throws Exception {
		System.out.println("connecting to :"+s);

	}
	

}
