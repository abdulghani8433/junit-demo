package com.junit.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.junit.demo.enities.BookEntity;
import com.junit.demo.repository.BookRepository;
import com.junit.utility.ResponseBean;

@RestController
@RequestMapping(value = "/book")
public class BooksController {

	private final BookRepository bookRepository;

	@Autowired
	public BooksController(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
		
	}



	public ResponseEntity<ResponseBean> addABook(@RequestBody BookEntity payload){

		

	}

}
