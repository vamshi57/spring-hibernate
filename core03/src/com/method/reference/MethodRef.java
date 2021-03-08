package com.method.reference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;



public class MethodRef {
	
	
	public static void main(String[] args) {
	  
		List<Person> persons=getPersons();
		
		//1dropWhile
	    List<Person>ps1=persons.stream().dropWhile(person ->person.getAddr().length()>5).collect(Collectors.toList());
		System.out.println(ps1.toString());
		
		//2takWhile
		List<Person>ps2=persons.stream().takeWhile(person ->person.getAddr().length()>5).collect(Collectors.toList());
		System.out.println(ps2.toString());
		
		//3takeWhile
		List<Person>ps3=persons.stream().takeWhile(person ->person.getAge()>15).collect(Collectors.toList());
		System.out.println(ps3.toString());
		
		//4limit
		persons.stream().limit(1).forEach(System.out::println);
		
		List<Person> sorted=persons.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
				
		System.out.println("-------------------------------");
		sorted.stream().forEach(System.out::println);
		System.out.println("---------------------------------");
		persons.stream().sorted(Comparator.comparing(Person::getName).reversed()).forEach(System.out::println);
		System.out.println("--------------------------------");
		
}	
		public static List<Person> getPersons(){
			return Arrays.asList(
					new Person("vamshi", 24, "hyd"),
					new Person("ram", 24, "hyd"),
					new Person("ramesh", 21, "hyd"));	
			
			

        }
	
}
