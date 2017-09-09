package com.hellojava.business;

import java.util.List;

import org.apache.log4j.Logger;

import com.gellojava.web.entity.Book;
import com.hellojava.database.dao.BookDao;

public class BookService {
	private Logger log=Logger.getLogger(BookService.class);
	private BookDao bookDao=new BookDao();
	
	public List<Book> loadAll(int page,int displayCount){
		List<Book> bookList=null;
		try {
			bookList=bookDao.loadAll(page,displayCount);
		} catch (Exception e) {
			log.debug(e.getMessage());
		}
		return bookList;
	}
	
	public int calctorMaxPage(int displayCount) {
		int maxPage=0;
		try {
			int count=bookDao.getTotalCount();
			maxPage=count%displayCount==0?count/displayCount:count/displayCount+1;
		} catch (Exception e) {
			log.debug(e.getMessage());
		}
		return maxPage-1;
	}
	
	public boolean save(Book b) {
		boolean bool=false;
		try {
			int count=bookDao.save(b);
			bool=count>0?true:false;
		} catch (Exception e) {
			log.debug(e.getMessage());
		}
		return bool;
	}

	public boolean delete(String...ids) {
		boolean bool=false;
		try {
			int count=bookDao.delete(ids);
			bool=count>0?true:false;
		} catch (Exception e) {
			log.debug(e.getMessage());
		}
		return bool;
	}

	public Book loadUpdateBook(int bookId) {
		Book b=null;
		try {
			b=bookDao.loadUpdateBOok(bookId);
		} catch (Exception e) {
			log.debug(e.getMessage());
		}
		return b;
	}
	
	public boolean update(Book b) {
		boolean bool=false;
		try {
			int count=bookDao.update(b);
			bool=count>0?true:false;
		} catch (Exception e) {
			log.debug(e.getMessage());
		}
		return bool;
	}
}
