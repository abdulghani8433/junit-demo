package com.junit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.junit.demo.enities.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Long> {

}
