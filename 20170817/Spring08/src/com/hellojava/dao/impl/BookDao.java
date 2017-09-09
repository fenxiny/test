package com.hellojava.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.hellojava.dao.IBookDao;
import com.hellojava.database.DBManager;
import com.hellojava.database.IDBManager;
import com.hellojava.entity.Book;
//注解用于标识持久化对象
@Repository("bookDao")
public class BookDao implements IBookDao {
	@Autowired
	private IDBManager dbmanager;
	@Override
	public List<Book> loadAll() throws SQLException{
		List<Book> bookList=new ArrayList<>();
		String sql="select * from book";
		ResultSet rs=dbmanager.query(sql,null);
		while(rs.next()) {
			Book b=new Book();
			b.setBookId(rs.getInt("bookId"));
			b.setBookName(rs.getString("bookName"));
			b.setBookAuthor(rs.getString("bookAuthor"));
			b.setBookPrice(rs.getDouble("bookPrice"));
			b.setBookInfo(rs.getString("bookInfo"));
			
			bookList.add(b);
		}
		return bookList;
	}

}
