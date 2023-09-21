package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.demo.entity.Book;
import com.demo.repo.BookRepo;
@Component
public class BookServiceImpl implements BookService
{
      BookRepo bookRepo;
      
      public BookServiceImpl(BookRepo bookRepo)
      {
    	  this.bookRepo=bookRepo;
      }
	
	
	@Override
	public String addBook(Book book) {
		
		bookRepo.save(book);
		return "Saved";
	}

	@Override
	public List<Book> getAllBooks() {
   

		return  bookRepo.findAll();
	}

	@Override
	public String deteleBook(Integer bookid) {

   bookRepo.deleteById(bookid);
		return "Book deleted";
	}

}
