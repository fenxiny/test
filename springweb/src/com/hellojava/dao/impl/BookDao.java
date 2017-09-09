package com.hellojava.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.hellojava.dao.IBookDao;
import com.hellojava.entity.Book;

public class BookDao extends JdbcDaoSupport implements IBookDao {

	@Override
	public List<Book> loadAll() {
		List<Book> bookList=new ArrayList<Book>();
		String sql="select * from book";
		this.getJdbcTemplate().query(sql, new RowCallbackHandler() {
			public void processRow(ResultSet rs) throws SQLException {
				while(rs.next()) {
					Book b=new Book();
					b.setBookId(rs.getInt("bookId"));
					b.setBookName(rs.getString("bookName"));
					b.setBookAuthor(rs.getString("bookAuthor"));
					b.setBookPrice(rs.getDouble("bookPrice"));
					b.setBookInfo(rs.getString("bookInfo"));
					
					bookList.add(b);
				}
			}
		});
		return bookList;
	}

}
