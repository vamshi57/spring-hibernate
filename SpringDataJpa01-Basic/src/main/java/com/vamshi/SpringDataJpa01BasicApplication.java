package com.vamshi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vamshi.repository.ProductRepository;

@SpringBootApplication
public class SpringDataJpa01BasicApplication implements CommandLineRunner {
	@Autowired
	private ProductRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpa01BasicApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		 * repository.save(new Product(1022l, "item11", 103)); repository.save(new
		 * Product(1023l, "item11", 103)); repository.save(new Product(1024l, "item11",
		 * 103));
		 * 
		 * System.out.println(repository.getClass().getName());
		 * 
		 * 
		 * Iterable<Product> iterator = repository.findAll();
		 * 
		 * 
		 * System.out.println("All product items: "); iterator.forEach(pname ->
		 * System.out.println(pname));
		 * 
		 * List<Product> breakfast = repository.findByPname("item1");
		 * System.out.println("\nHow does my product cost?: "); breakfast.forEach(pname
		 * -> System.out.println(pname));
		 * 
		 * List<Product> expensiveItems = repository.listItemsWithPriceOver(300);
		 * System.out.println("\nExpensive Items: "); expensiveItems.forEach(item ->
		 * System.out.println(item));
		 */
//		
//		System.out.println(repository.count());
//		List<Product1> listprodI=repository.findByPid(101l, Product1.class);
//		listprodI.forEach(x->System.out.println(x.getPname()+" "+x.getPrice()));
		
//		List<Object[]> data=repository.findByPid(101l);
//		Object[] a=data.get(0);
//		
//		for(Object b:a) {
//			System.out.println(b);
//		}
//		
//		
//		System.out.println();
//		System.out.println("vamshi");
		
		Map< String , Object> map=new HashMap<String, Object>();
		
		map.put("aa", "caas");
		map.put("bb", "cas1");
		map.put("cc","case3");
		map.put("dd", "case4");
		map.put("ee", "case5");
		
				
	
		
		List<Object> data1=repository.findBy(101l);
		
		
		
		/*
		 * for(Product1 p:listprodI) {
		 * System.out.println(p.getPname()+" "+p.getPrice()); }
		 */

			
	}

}
