package com.hellojava.ssm.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hellojava.ssm.business.IBookService;
import com.hellojava.ssm.dao.IBookDao;
import com.hellojava.ssm.entity.Book;

@Service("bookService")
public class BookService implements IBookService{
	@Autowired
	private IBookDao bookDao;

	public BookService() {
		System.out.println("BookService");
	}
	
	@Override
	public List<Book> loadAll() {
		return bookDao.loadAll();
	}
}
