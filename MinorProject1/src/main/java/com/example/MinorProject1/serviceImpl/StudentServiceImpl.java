package com.example.MinorProject1.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MinorProject1.model.Student;
import com.example.MinorProject1.repository.StudentRespositoryInterf;
import com.example.MinorProject1.requests.StudentCreateRequest;
import com.example.MinorProject1.service.StudentServiceInterf;

@Service
public class StudentServiceImpl implements StudentServiceInterf{
	
	@Autowired
	StudentRespositoryInterf studentRespositoryInterf;

	@Override
	public Student save(StudentCreateRequest studentCreateRequest) {
		
		return saveFromStudent(studentCreateRequest.toStudent());
	}
	
	public Student saveFromStudent(Student student) {
		return studentRespositoryInterf.save(student);
	}

	@Override
	public Student findById(int studentId) {
		return studentRespositoryInterf.findById(studentId).get();
	}

	@Override
	public List<Student> findAllStudent() {
		return studentRespositoryInterf.findAll();
	}

	@Override
	public void deleteStudentById(int id) {
		studentRespositoryInterf.deleteById(id);
	}

}