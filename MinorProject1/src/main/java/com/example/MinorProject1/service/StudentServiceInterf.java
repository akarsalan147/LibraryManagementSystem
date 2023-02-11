package com.example.MinorProject1.service;

import java.util.List;

import com.example.MinorProject1.model.Student;
import com.example.MinorProject1.requests.StudentCreateRequest;

public interface StudentServiceInterf {
	Student save(StudentCreateRequest studentCreateRequest);
	Student saveFromStudent(Student student);
	Student findById(int studentId);
	List<Student> findAllStudent();
	void deleteStudentById(int id);
}