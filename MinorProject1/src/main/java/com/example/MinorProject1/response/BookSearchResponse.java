package com.example.MinorProject1.response;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.example.MinorProject1.enums.Genre;
import com.example.MinorProject1.model.Author;
import com.example.MinorProject1.model.Student;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookSearchResponse {
	
	private int id;
	
	private String name;
	
	private int cost;
	
	private String isbn;
	
	private Genre genre;
	
	private Student student;
	
	@JsonIgnoreProperties({"bookList"})
	private Author author;
	
	@CreationTimestamp
	private Date createdOn;
	
	@UpdateTimestamp
	private Date updatedOn;

}