package com.hellojava.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hellojava.business.IBookService;
import com.hellojava.dao.IBookDao;
import com.hellojava.entity.Book;

@Service("bookService")
public class BookService implements IBookService {
	@Autowired
	private IBookDao bookDao;
	@Override
	public List<Book> loadAll(int page,int displayCount) {
		return bookDao.loadAll(page-1,displayCount);
	}
	@Override
	public int calcMaxPage(int displayCount) {
		int count=bookDao.getMaxCount();
		return count%displayCount==0?count/displayCount:count/displayCount+1;
	}
	@Override
	public boolean save(Book b) {
		int count=bookDao.save(b);
		return count>0?true:false;
	}
	@Override
	public boolean delete(int id) {
		int count=bookDao.delete(id);
		return count>0?true:false;
	}
	@Override
	public Book loadById(int id) {
		return bookDao.loadById(id);
	}
	@Override
	public boolean update(Book b) {
		int count=bookDao.update(b);
		return count>0?true:false;
	}

}
