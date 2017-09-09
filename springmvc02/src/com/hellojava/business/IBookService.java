package com.hellojava.business;

import java.util.List;

import com.hellojava.entity.Book;

public interface IBookService {
	public List<Book> loadAll(int page,int displayCount);
	public int calcMaxPage(int displayCount);
	public boolean save(Book b);
	public boolean delete(int id);
	public Book loadById(int id);
	public boolean update(Book b);
}
