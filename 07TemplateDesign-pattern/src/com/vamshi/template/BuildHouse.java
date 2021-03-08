package com.vamshi.template;

public abstract class BuildHouse {
	public final void buildHouse() {
		foundation();
		pillar();
		wall();
	    windowns();
	}

	public void foundation() {
		System.out.println("foundation done with... sand");
	}
	public void pillar() {
		System.out.println("pillar are done cement and conctrete");
	}
	public abstract void wall();
	public abstract void windowns();
}
