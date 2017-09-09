package com.hellojava.entity;

import java.io.Serializable;

public class Book implements Serializable,Comparable<Book>{
	private int bookId;
	private String bookName;
	private String bookAuthor;
	private double bookPrice;
	private String bookInfo;
	public Book() {

	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookInfo() {
		return bookInfo;
	}
	public void setBookInfo(String bookInfo) {
		this.bookInfo = bookInfo;
	}
	@Override
	public int compareTo(Book arg0) {
		// TODO Auto-generated method stub
		return new Integer(this.bookId).compareTo(arg0.bookId);
	}
}
