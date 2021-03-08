package com.vamshi;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;





public class Stream {
	/*List<Integer> list =new ArrayList<>();
	
	List<String > names=new ArrayList<>();
	void addList(){
	
	
		
		list.add(0);
		list.add(1);
		
		
	
		
		names.add("vadlakondavamshikrishna");
		
		
	}
	int getSum() {
		
		//return list.stream().mapToInt(x->x+2).sum();
	//list.stream().filter(x->x>2).forEach(System.out::println);
	
		//List<Integer> list1=list.stream().sorted().collect(Collectors.toList());
	//System.out.println(list1);
		Optional<String>  st1=names.stream().reduce((s1,s2)->s1+s2);
		st1.stream().forEach(System.out::println);
	return 0;
	}
	
	public static void main(String[] args) {
		String s="vamshi";
		 Optional<String > st2=Optional.ofNullable(s);
		 OptionalInt i=OptionalInt.of(12);
		Stream st=new Stream();
		st.addList();
		st.getSum();
		System.out.println(st2.isEmpty());
		System.out.println(i.isEmpty());
		
	}*/

	/*public static void main(String[] args) {
		List<String> lt=Arrays.asList(
				new String[] {
				"vamshi","vamshi","ram","siva","ram","siva","rakesh","mechainel","jockson","vivek","vinod","vijay","vimal"
			     }
		);
		
		System.out.println(lt);
		List<String> lt1=lt.stream().filter(s1->s1.startsWith("v")).collect(Collectors.toList());
		List<String> lt2=lt.stream().distinct().collect(Collectors.toList());
		Set<String> st1=lt.stream().collect(Collectors.toSet());
	
		System.out.println(lt1);
		System.out.println(lt2);
		System.out.println(st1+" "+st1.getClass().getName());
		
		
	}*/
	
	public static void main(String[] args) {
		List<Person> persons=getPerson();
		
	/*List<Person> females=new ArrayList<>();
	
	for(Person person:persons) {
		if(person.getGender().equals(Gender.FEMALE)) {
			females.add(person);
		}
	}
	females.forEach(System.out::println);	
	*/
   //filter
		/*persons.stream()
		   .filter(person->person.getGender().equals(Gender.FEMALE)).forEach(System.out::println);
		//filter
		 * persons.stream() 
		 *      .filter(person->person.getGender().equals(Gender.MALE)).forEach(System.out::println);
		 *      
		 * 
		 */
		
		//sort
		persons.stream()
		.sorted(Comparator.comparing(Person::getAge).reversed()).forEach(System.out::println);
       
		//allmatch
		boolean allMatch=persons.stream()
	       .allMatch(person->person.getAge()>35);
		System.out.println(allMatch);
		
		//anymatch
		boolean anyMatch=persons.stream()
		      .anyMatch(person->person.getAge()==24);
		System.out.println(anyMatch);
		
		//nonematch
		boolean noneMatch =persons.stream()
				          .noneMatch(person->person.getName().equalsIgnoreCase("vamshi"));
		System.out.println(noneMatch);
		
		
		//max
		persons.stream()
		       .max(Comparator.comparing(Person::getAge))
		       .ifPresent(System.out::print);
		//min
		persons.stream()
		        .min(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);       
		//group
		Map<Gender, List<Person>> groupByGender=persons.stream()
				                                 .collect(Collectors.groupingBy(Person::getGender));
		System.out.println();
		groupByGender.forEach((gender,person)->
		{
			System.out.println(gender);
			person.forEach(System.out::println);
			System.out.println();
		});
	}
	  
	private static List<Person> getPerson(){
		return List.of(
				new Person("Vamshi", 24, Gender.MALE)
				,new  Person("ram", 20, Gender.MALE),
				new Person("anjaneyulu", 45, Gender.MALE),
				new Person("kavitha", 40, Gender.FEMALE)
				);
	}
	
}
