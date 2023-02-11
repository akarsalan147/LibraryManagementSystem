package com.example.MinorProject1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MinorProject1.enums.TransactionType;
import com.example.MinorProject1.model.Book;
import com.example.MinorProject1.model.Student;
import com.example.MinorProject1.model.Transaction;

public interface TransactionRepositoryInterf extends JpaRepository<Transaction, Integer>{

	Transaction findTopByBookAndStudentAndTransactionTypeOrderByIdDesc(Book book, Student student,
			TransactionType issue);

}