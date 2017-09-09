package com.hellojava.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hellojava.business.IBookService;
import com.hellojava.dao.IBookDao;
import com.hellojava.entity.Book;

@Service("bookService")
public class BookService implements IBookService{
	@Autowired
	private IBookDao bookDao;
	
	public List<Book> loadAll(){
		return bookDao.loadAll();
	}

	@Override
	public Book loadById(int bookId) {
		return bookDao.loadById(bookId);
	}

	@Override
	public boolean save(Book b) {
		int count=bookDao.save(b);
		return count>0?true:false;
	}

	@Override
	public boolean delete(int bookId) {
		int count=bookDao.delete(bookId);
		return count>0?true:false;
	}

	@Override
	public boolean update(Book b) {
		int count=bookDao.update(b);
		return count>0?true:false;
	}
	
}
