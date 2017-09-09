package com.hellojava.business;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.hellojava.entity.Book;

public class BookService {
	private static List<Book> bookList;
	static {
		bookList=new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			Book b=new Book();
			b.setBookId(i);
			b.setBookName("Java权威指南"+i);
			b.setBookAuthor("张三"+i);
			b.setBookPrice(333.44+i);
			b.setBookInfo("测试数据");
			
			bookList.add(b);
		}
		
		Collections.sort(bookList);
	}
	
	public List<Book> loadAll(){
		return bookList;
	}
	
	public boolean delete(String...ids) {
		for(String id : ids) {
			int i=Integer.parseInt(id);
			Iterator<Book> bookIter=bookList.iterator();
			while(bookIter.hasNext()) {
				if(bookIter.next().getBookId()==i) {
					bookIter.remove();
					break;
				}
			}
		}
		Collections.sort(bookList);
		return true;
	}
	
	public boolean save(Book book) {
		int maxBookId=bookList.get(bookList.size()-1).getBookId()+1;
		book.setBookId(maxBookId);
		bookList.add(book);
		Collections.sort(bookList);
		return true;
	}
}
