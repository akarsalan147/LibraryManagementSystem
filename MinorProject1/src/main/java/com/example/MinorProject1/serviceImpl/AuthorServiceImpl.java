package com.example.MinorProject1.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MinorProject1.model.Author;
import com.example.MinorProject1.repository.AuthorRepositoryInterf;
import com.example.MinorProject1.service.AuthorServiceInterf;

@Service
public class AuthorServiceImpl implements AuthorServiceInterf {

	@Autowired
	AuthorRepositoryInterf authorRepositoryInterf;
	
	@Override
	public Author createAuthor(Author author) {
		authorRepositoryInterf.save(author);
		return author;
	}

	@Override
	public Author findByEmail(String email) {
		return authorRepositoryInterf.findByEmail(email);
	}

}