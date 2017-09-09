package com.hellojava.database.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hellojava.database.DBManager;
import com.hellojava.entity.Book;

public class BookDao extends DBManager{
	public List<Book> loadByPage(int page,int displayCount)throws SQLException{
		List<Book> bookList=new ArrayList<>();
		Connection conn=this.openConnection();
		String sql="select * from book limit ?,?";
		Object[] obs= {page*displayCount,displayCount};
		ResultSet rs=this.query(conn, sql, obs);
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
	
	public int getMaxCount() throws SQLException{
		int maxCount=0;
		Connection conn=this.openConnection();
		String sql="select count(bookId) from book";
		ResultSet rs=this.query(conn, sql, null);
		if(rs.next()) {
			maxCount=rs.getInt(1);
		}
		return maxCount;
	}
	
	public int save(Book book)throws SQLException{
		Connection conn=this.openConnection();
		String sql="insert into book values(default,?,?,?,?)";
		Object[] obs= {book.getBookName(),book.getBookAuthor(),book.getBookPrice(),book.getBookInfo()};
		return this.update(conn, sql, obs);
	}
	
	private String concatSql(String...ids) {
		String sql="delete from book where bookId in(";
		for (int i = 0; i < ids.length; i++) {
			sql+=i==ids.length-1?ids[i]:ids[i]+",";
		}
		sql+=")";
		return sql;
	}
	
	public int delete(String...ids)throws SQLException{
		Connection conn=this.openConnection();
		String sql=concatSql(ids);
		int count=this.update(conn, sql, null);
		return count;
	}
	
	public Book loadUpdate(int bookId)throws SQLException{
		Book book=null;
		Connection conn=this.openConnection();
		String sql="select * from book where bookId=?";
		Object[] obs= {bookId};
		ResultSet rs=this.query(conn, sql, obs);
		if(rs.next()) {
			book=new Book();
			book.setBookId(rs.getInt("bookId"));
			book.setBookName(rs.getString("bookName"));
			book.setBookAuthor(rs.getString("bookAuthor"));
			book.setBookPrice(rs.getDouble("bookPrice"));
			book.setBookInfo(rs.getString("bookInfo"));
		}
		return book;
	}
	
	public int update(Book book)throws SQLException{
		Connection conn=this.openConnection();
		String sql="update book set bookName=?,bookAuthor=?,bookPrice=?,bookInfo=? where bookId=?";
		Object[] obs= {book.getBookName(),book.getBookAuthor(),book.getBookPrice(),book.getBookInfo(),book.getBookId()};
		return this.update(conn, sql, obs);
	}
}
