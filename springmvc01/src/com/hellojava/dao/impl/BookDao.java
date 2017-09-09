package com.hellojava.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.hellojava.dao.IBookDao;
import com.hellojava.entity.Book;

public class BookDao extends JdbcDaoSupport implements IBookDao {

	@Override
	public List<Book> loadAll(int page,int displayCount) {
		List<Book> bookList=new ArrayList<Book>();
		String sql="select * from book limit ?,?";
		this.getJdbcTemplate().query(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
				PreparedStatement psment=conn.prepareStatement(sql);
				psment.setInt(1, page*displayCount);
				psment.setInt(2, displayCount);
				return psment;
			}
		}, new RowCallbackHandler() {
			public void processRow(ResultSet rs) throws SQLException {
				do{
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

	@Override
	public int getMaxCount() {
		
		String sql="select count(bookId) from book";
		return this.getJdbcTemplate().query(sql, new ResultSetExtractor<Integer>() {
			@Override
			public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
				int count=0;
				if(rs.next()) {
					count=rs.getInt(1);
				}
				return count;
			}
			
		});
	}

	@Override
	public int save(Book b) {
		String sql="insert into book values(default,?,?,?,?)";
		return this.getJdbcTemplate().update(sql, new Object[] {b.getBookName(),b.getBookAuthor(),b.getBookPrice(),b.getBookInfo()});
	}

	@Override
	public int delete(int id) {
		String sql="delete from book where bookId=?";
		return this.getJdbcTemplate().update(sql, new Object[] {id});
	}

	@Override
	public Book loadById(int id) {
		String sql="select * from book where bookId=?";
		return this.getJdbcTemplate().query(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
				PreparedStatement psment=conn.prepareStatement(sql);
				psment.setInt(1, id);
				return psment;
			}
		}, new ResultSetExtractor<Book>() {
			@Override
			public Book extractData(ResultSet rs) throws SQLException, DataAccessException {
				Book b=null;
				if(rs.next()) {
					b=new Book();
					b.setBookId(rs.getInt("bookId"));
					b.setBookName(rs.getString("bookName"));
					b.setBookAuthor(rs.getString("bookAuthor"));
					b.setBookPrice(rs.getDouble("bookPrice"));
					b.setBookInfo(rs.getString("bookInfo"));
				}
				return b;
			}
		});
	}

	@Override
	public int update(Book b) {
		String sql="update book set bookName=?,bookAuthor=?,bookPrice=?,bookInfo=? where bookId=?";
		return this.getJdbcTemplate().update(sql, new Object[] {b.getBookName(),b.getBookAuthor(),b.getBookPrice(),b.getBookInfo(),b.getBookId()});
	}

}
