package com.hellojava.dao;

import java.util.List;

import com.hellojava.entity.Book;

public interface IBookDao {
	public List<Book> loadAll(int page,int displayCount);
	public int getMaxCount();
	public int save(Book b);
	public int delete(int id);
	public Book loadById(int id);
	public int update(Book b);
}
