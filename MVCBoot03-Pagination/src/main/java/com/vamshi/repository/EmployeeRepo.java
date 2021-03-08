package com.vamshi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.vamshi.entity.Employee;

public interface EmployeeRepo extends PagingAndSortingRepository<Employee, Integer> {

}
