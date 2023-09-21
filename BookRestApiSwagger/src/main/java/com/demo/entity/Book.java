package com.demo.entity;

import javax.persistence.*;


@Entity
@Table(name="Book_details")
public class Book 
{
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
@Column(name="BooK_ID")
 private Integer bookId;
@Column(name="BOOK_NAME")
 private String bookName;
@Column(name="Book_Price")
 private String bookPrice;
public Integer getBookId() {
	return bookId;
}
public void setBookId(Integer bookId) {
	this.bookId = bookId;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getBookPrice() {
	return bookPrice;
}
public void setBookPrice(String bookPrice) {
	this.bookPrice = bookPrice;
}
}
