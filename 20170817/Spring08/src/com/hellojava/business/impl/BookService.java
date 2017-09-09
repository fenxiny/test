package com.hellojava.business.impl;

import java.sql.SQLException;
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
	@Override
	public List<Book> loadAll() {
		List<Book> bookList=null;
		try {
			bookList=bookDao.loadAll();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return bookList;
	}
}
