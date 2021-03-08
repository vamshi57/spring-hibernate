package com.vamshi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.vamshi.dto.EmployeeDTO;
import com.vamshi.entity.Employee;
import com.vamshi.repository.EmployeeRepo;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepo empRepo;

	@Override
	public int getPagesCount(int pageSize) {
		int pageCount=0;
		long recordCount=0;
        recordCount=empRepo.count();
        pageCount=(int)recordCount/pageSize;
        if(recordCount%pageSize!=0) {
        	pageCount++;
        }
        
		return pageCount;
	}

	@Override
	public List<EmployeeDTO> getPageData(int pageNo, int pageSize) {
		Pageable pageable=null;
		Page<Employee> page=null;
		List<Employee> listEntities=null;
		List<EmployeeDTO> listDTO=new ArrayList<>();
		//create Pageable object
		pageable=PageRequest.of(pageNo, pageSize,Sort.by("ename").ascending());
		//get Page object
		page=empRepo.findAll(pageable);
		//listEntities=page.getContent();
		//covert to listEntities
		listEntities=page.get().collect(Collectors.toList());  //java8 stream api
		//convert listEntities to listDTO
		listEntities.forEach(entity->{
			EmployeeDTO dto=new EmployeeDTO();
			BeanUtils.copyProperties(entity, dto);
			listDTO.add(dto);
		});		
		return listDTO;
	}

}
