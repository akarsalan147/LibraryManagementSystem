package com.example.MinorProject1.service;

import com.example.MinorProject1.model.Author;

public interface AuthorServiceInterf {
	
	Author createAuthor(Author author);
	
	Author findByEmail(String email);

}