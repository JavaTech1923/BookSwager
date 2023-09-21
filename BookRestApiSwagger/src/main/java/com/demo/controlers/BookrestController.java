package com.demo.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Book;
import com.demo.service.BookService;

@RestController
public class BookrestController 
{
    @Autowired(required=true)
    BookService bookService;
	
	@PostMapping("/book")
	public ResponseEntity<String> addBook(@RequestBody Book book)
	{
		String m=bookService.addBook(book);
	return new ResponseEntity<String>(m,HttpStatus.OK)	;
	}
   
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getBooks()
	{
		List<Book> allbook=bookService.getAllBooks();
	return new ResponseEntity<>(allbook,HttpStatus.OK)	;
	}
    
	@PutMapping("/book/insert")
	public ResponseEntity<String> addBooks(@RequestBody Book book)
	{
		String m=bookService.addBook(book);
	return new ResponseEntity<String>(m,HttpStatus.OK)	;
	}
	
	@DeleteMapping("/book/{bookid}")
	public ResponseEntity<String> deleteBook(@PathVariable Integer bookid)
	{
		
		String m=bookService.deteleBook(bookid);
		return new ResponseEntity<>(m,HttpStatus.OK);
	}
	
}
