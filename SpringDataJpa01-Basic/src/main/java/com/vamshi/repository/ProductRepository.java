package com.vamshi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.vamshi.entity.Product;
import java.lang.String;

public interface ProductRepository extends CrudRepository<Product, Long> {

	public List<Product> findByPname(String pname);

	@Query("SELECT p FROM Product p WHERE p.price >= price")
	public List<Product> listItemsWithPriceOver(@Param("price") float amount);
	
  public <T extends ProductInterface> List<T> findByPid(Long pid,Class<T> clazz);
  
  @Query("SELECT pname,price FROM Product WHERE pid=:pid ")
  public List<Object[]> findByPid(Long pid);
  
  @Query("SELECT pname,price FROM Product WHERE pid=:pid ")
  public List<Object> findBy(Long pid);	
	 
}
