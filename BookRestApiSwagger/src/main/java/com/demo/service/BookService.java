package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.demo.entity.Book;
@Component
public interface BookService
{

	public String addBook(Book book);
	public List<Book> getAllBooks();
	//public String UpdateBook(Book book);
	public String deteleBook(Integer bookid);
}
