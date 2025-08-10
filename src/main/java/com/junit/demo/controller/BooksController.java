package com.junit.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junit.demo.repository.BookRepository;

@RestController
@RequestMapping(value = "/book")
public class BooksController {

	private final BookRepository bookRepository;

	@Autowired
	public BooksController(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

}
