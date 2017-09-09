package com.hellojava.business;

import java.util.List;

import com.hellojava.entity.Book;

public interface IBookService {
	public List<Book> loadAll();
	public Book loadById(int bookId);
	public boolean save(Book b);
	public boolean delete(int bookId);
	public boolean update(Book b);
}
