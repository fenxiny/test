package com.hellojava.business;

import java.util.List;

import org.apache.log4j.Logger;

import com.hellojava.database.dao.BookDao;
import com.hellojava.web.entity.Book;

public class BookService {
	private Logger log=Logger.getLogger(BookService.class);
	private BookDao bookDao=new BookDao();
	
	public List<Book> loadAll(int page , int displayCount){
		List<Book> list=null;
		try {
			list=bookDao.loadAll(page , displayCount);
		} catch (Exception e) {
			log.debug(e.getMessage());
		}
		return list;
	}
	
	public int calctorMaxPage(int displayCount) {
		int maxPage=0;
		try {
			int totalCount=bookDao.getTotalCount();
			maxPage=totalCount%displayCount==0?totalCount/displayCount:totalCount/displayCount+1;
		} catch (Exception e) {
			log.debug(e.getMessage());
		}
		return maxPage-1;
	}
}
