package com.hellojava.business;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import com.hellojava.database.dao.BookDao;
import com.hellojava.entity.Book;

public class BookService {
	private BookDao bookDao=new BookDao();
	private Logger logger=Logger.getLogger(BookService.class);
	public List<Book> loadByPage(int page,int displayCount){
		List<Book> bookList=null;
		try {
			bookList=bookDao.loadByPage(page, displayCount);
		} catch (Exception e) {
			logger.debug(e.getMessage());
		}
		return bookList;
	}
	
	public int calctorMaxPage(int displayCount) {
		int maxPage=0;
		try {
			int maxCount=bookDao.getMaxCount();
			maxPage=maxCount%displayCount==0?maxCount/displayCount:maxCount/displayCount+1;
		} catch (SQLException e) {
			logger.debug(e.getMessage());
		}
		return maxPage-1;
	}
	
	public boolean save(Book book) {
		boolean bool=false;
		try {
			int count=bookDao.save(book);
			if(count>0)
				bool=true;
		} catch (Exception e) {
			logger.debug(e.getMessage());
		}
		return bool;
	}
	
	public boolean delete(String...ids) {
		boolean bool=false;
		try {
			int count=bookDao.delete(ids);
			if(count>0)
				bool=true;
		} catch (Exception e) {
			logger.debug(e.getMessage());
		}
		return bool;
	}
	
	public Book loadUpdate(int bookId){
		Book book=null;
		try {
			book=bookDao.loadUpdate(bookId);
		} catch (Exception e) {
			logger.debug(e.getMessage());
		}
		return book;
	}

	public boolean update(Book book) {
		boolean bool=false;
		try {
			int count=bookDao.update(book);
			if(count>0)
				bool=true;
		} catch (Exception e) {
			logger.debug(e.getMessage());
		}
		return bool;
	}
}
