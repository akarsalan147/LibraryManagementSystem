package com.example.MinorProject1.service;

import java.util.List;

import org.apache.coyote.http11.filters.VoidInputFilter;

import com.example.MinorProject1.enums.BookFilterType;
import com.example.MinorProject1.enums.BookSearchOperationType;
import com.example.MinorProject1.model.Book;
import com.example.MinorProject1.requests.BookCreateRequest;
import com.example.MinorProject1.response.BookSearchResponse;

public interface BookServiceInterf {
	
	Book create(BookCreateRequest bookCreateRequest);
	
	Book save(Book book);
	
	void deleteBook(int id);
	
	List<Book> getAllBooks();
	
	Book findById(Integer id);
	
	public List<BookSearchResponse> findFilteredBooks(BookFilterType bookFilterType, String value);
	
	public List<BookSearchResponse> findRobustFilteredBooks(BookFilterType bookFilterType, String value,
			BookSearchOperationType bookSearchOperationType);

	//add update and delete Methods

}