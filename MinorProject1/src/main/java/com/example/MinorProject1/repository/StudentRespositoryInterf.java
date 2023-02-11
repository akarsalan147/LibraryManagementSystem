package com.example.MinorProject1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MinorProject1.model.Student;

public interface StudentRespositoryInterf extends JpaRepository<Student, Integer>{

}