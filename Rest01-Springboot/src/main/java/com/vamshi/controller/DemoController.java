package com.vamshi.controller;



import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vamshi.entity.Student;
import com.vamshi.entity.StudentErrorResponse;
import com.vamshi.error.StudentNotFoundException;
@CrossOrigin
@RestController
@RequestMapping("/test")
public class DemoController {
	private List<Student> listStd;
	
	@PostConstruct
   public void loadData() {
		listStd=new ArrayList<Student>();
		listStd.add(new Student("vamshi", "vadlakonda"));
		listStd.add(new Student("ram", "vadlakonda"));
		listStd.add(new Student("anjaneyulu", "vadlakonda"));
		listStd.add(new Student("kavitha", "vadlakonda"));
	
	}
	
	
	
	@GetMapping("/hello")
	public String sayHello() {
		return "hello world!";
	}
	@GetMapping("/students")
	public List<Student> getStudents(){
		return listStd;
		
	}
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int  studentId) {
		if ( (studentId >= listStd.size()) || (studentId < 0) ) {			
			throw new StudentNotFoundException("Student id not found - " + studentId);
		}
		return listStd.get(studentId);
	}
	
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc) {
		
		StudentErrorResponse error = new StudentErrorResponse();
		
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exc.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	 }
}
