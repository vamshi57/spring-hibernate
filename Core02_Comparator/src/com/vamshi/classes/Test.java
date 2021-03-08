package com.vamshi.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Laptop> l=new ArrayList<>();
		l.add(new Laptop("dell",50000 ));
		l.add(new Laptop("lenova", 40000));
		l.add(new Laptop("acer", 30000));
		String a=null;
		
		Comparator<Laptop> com=new Comparator<Laptop>() {

			@Override
			public int compare(Laptop o1, Laptop o2) {
				if(o1.getPrice()>o2.getPrice()) {
					return 1;
				}
				else{
					return -1;
				}
				
			}
			
		};
		Collections.sort(l, com);
		l.forEach(System.out::println);
		System.out.println();
		
	}

}
