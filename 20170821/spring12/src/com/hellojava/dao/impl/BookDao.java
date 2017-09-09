package com.hellojava.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.hellojava.dao.IBookDao;
import com.hellojava.entity.Book;

public class BookDao extends JdbcDaoSupport implements IBookDao {
	@Override
	public List<Book> loadAll() {
		List<Book> bookList=new ArrayList<Book>();
		String sql="select * from book";
		this.getJdbcTemplate().query(sql, new RowCallbackHandler(){
			//ResultSet ÒÑ¾­next() 
			public void processRow(ResultSet rs) throws SQLException {
				do {
					Book b=new Book();
					b.setBookId(rs.getInt("bookId"));
					b.setBookName(rs.getString("bookName"));
					b.setBookAuthor(rs.getString("bookAuthor"));
					b.setBookPrice(rs.getDouble("bookPrice"));
					b.setBookInfo(rs.getString("bookInfo"));
					
					bookList.add(b);
				}while(rs.next());
			}
		});
		return bookList;
	}
	
	public Book loadById(int bookId) {
		final Book b=new Book();
		String sql="select * from book where bookId=?";
		this.getJdbcTemplate().query(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
				PreparedStatement psment=conn.prepareStatement(sql);
				psment.setInt(1, bookId);
				return psment;
			}
		}, new RowCallbackHandler() {
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				b.setBookId(rs.getInt("bookId"));
				b.setBookName(rs.getString("bookName"));
				b.setBookAuthor(rs.getString("bookAuthor"));
				b.setBookPrice(rs.getDouble("bookPrice"));
				b.setBookInfo(rs.getString("bookInfo"));
			}
		});
		return b;
	}

	@Override
	public int save(Book b) {
		int count=0;
		String sql="insert into book values(default,?,?,?,?)";
		return this.getJdbcTemplate().update(sql,new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement psment) throws SQLException {
				psment.setString(1, b.getBookName());
				psment.setString(2, b.getBookAuthor());
				psment.setDouble(3, b.getBookPrice());
				psment.setString(4, b.getBookInfo());
			}
		});
	}

	@Override
	public int delete(int bookId) {
		int count=0;
		String sql="delete from book where bookId=?";
		return this.getJdbcTemplate().execute(sql, new PreparedStatementCallback<Integer>() {
			@Override
			public Integer doInPreparedStatement(PreparedStatement psment) throws SQLException, DataAccessException {
				psment.setInt(1, bookId);
				return psment.executeUpdate();
			}
		});
	}

	@Override
	public int update(Book b) {
		int count=0;
		String sql="update book set bookName=?,bookAuthor=?,bookPrice=?,bookInfo=? where bookId=?";
		return this.getJdbcTemplate().update(sql,new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement psment) throws SQLException {
				psment.setString(1, b.getBookName());
				psment.setString(2, b.getBookAuthor());
				psment.setDouble(3, b.getBookPrice());
				psment.setString(4, b.getBookInfo());
				psment.setInt(5, b.getBookId());
			}
		});
	}
}
