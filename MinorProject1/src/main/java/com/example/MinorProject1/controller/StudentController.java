package com.example.MinorProject1.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.spi.ValidationProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.MinorProject1.model.Student;
import com.example.MinorProject1.requests.StudentCreateRequest;
import com.example.MinorProject1.service.StudentServiceInterf;

@RestController
public class StudentController {

	@Autowired
	StudentServiceInterf studentServiceInterf;
	
	@PostMapping("/saveStudent")
	public ResponseEntity saveStudent(@Valid  @RequestBody StudentCreateRequest studentCreateRequest) {
		return new ResponseEntity(studentServiceInterf.save(studentCreateRequest),HttpStatus.CREATED);
		
	}
	
	@GetMapping("/student/{id}")
	public Student getStudentById(@RequestParam("id") int id) {
		return studentServiceInterf.findById(id);
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return studentServiceInterf.findAllStudent();
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public void deleteStudent(@RequestParam("id") int id) {
		studentServiceInterf.deleteStudentById(id);
	}
}