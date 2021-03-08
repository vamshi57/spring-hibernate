package com.vamshi;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;



public   class Functional {
	
	public static void main(String[] args) {
		List<Person1> people= List.of(
				new Person1("vamshi",24, "hyderbad"),
				new Person1("ravi", 23,"hyderbad"),
				new Person1("roshi", 23, "hyd"),
				new Person1("avinash", 23, "banglore")
				);
		
		Consumer<List<Person1>> consumer=person->person.forEach(System.out::println);
		
		consumer.accept(people);
		
		BiConsumer<List<Person1>, Boolean> biconsumer=(person,b)->person.forEach(System.out::println);
		
		biconsumer.accept(people, false);
		
	}
}


