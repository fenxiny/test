package com.hellojava.dao;

import java.util.List;

import com.hellojava.entity.Book;

public interface IBookDao {
	public List<Book> loadAll();
	public Book loadById(int bookId);
	public int save(Book b);
	public int delete(int bookId);
	public int update(Book b);
}
