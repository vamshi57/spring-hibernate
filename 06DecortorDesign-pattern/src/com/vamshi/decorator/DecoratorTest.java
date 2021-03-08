package com.vamshi.decorator;

interface Dress{
	public void assemble();
}


class BasicDress implements Dress{

	@Override
	public void assemble() {
		System.out.println("basic dress features");
		
	}	
}


class DressDecorator implements Dress{
	protected Dress c;
	 public DressDecorator(Dress c) {
		this.c=c;
	}
	@Override
	public void assemble() {
		this.c.assemble();
	}	
}


class CasualDress extends DressDecorator{

	public CasualDress(Dress c) {
		super(c);
	}
	@Override
	public void assemble() {
		System.out.println("adding casual dress feature");
	}
	
}

class SportyDress extends DressDecorator{

	public SportyDress(Dress c) {
		super(c);
	}
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("adding sporty dress features");
	}
	
}

class FancyDress extends DressDecorator{

	public FancyDress(Dress c) {
		super(c);
		System.out.println("adding fancyDress ");
	}
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("adding fancyDress feature");
	}
	
}


class SpecyDress extends DressDecorator{

	public SpecyDress(Dress c) {
		super(c);
		System.out.println("adding fancyDress ");
	}
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("adding fancyDress feature");
	}
	
}




public class DecoratorTest {
	public static void main(String[] args) {
		Dress sporty=new SportyDress(new FancyDress(new BasicDress()));
		sporty.assemble();
		
	}

}
