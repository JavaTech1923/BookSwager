package com.demo.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Book;

public interface BookRepo  extends JpaRepository<Book, Serializable>
{

}
