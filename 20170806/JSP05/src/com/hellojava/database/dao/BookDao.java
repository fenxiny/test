package com.hellojava.database.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gellojava.web.entity.Book;
import com.hellojava.database.DBManager;

public class BookDao extends DBManager{
	/**
	 * 
	 * @param page
	 * @param displayCount
	 * @return
	 * @throws SQLException
	 */
	public List<Book> loadAll(int page,int displayCount)throws SQLException{
		List<Book> list=new ArrayList<>();
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
			
			list.add(b);
		}
		this.closeConnection();
		return list;
	}
	
	public int getTotalCount()throws SQLException{
		int count=0;
		Connection conn=this.openConnection();
		String sql="select count(bookId) from book";
		ResultSet rs=this.query(conn, sql, null);
		if(rs.next()) {
			count=rs.getInt(1);
		}
		this.closeConnection();
		return count;
	}
	
	public int save(Book b)throws SQLException{
		Connection conn=this.openConnection();
		String sql="insert into book values(default,?,?,?,?)";
		Object[] obs= {b.getBookName(),b.getBookAuthor(),b.getBookPrice(),b.getBookInfo()};
		int count=this.update(conn, sql, obs);
		this.closeConnection();
		return count;
	}
	
	private String concatSQl(String... ids)throws SQLException{
		String sql="delete from book where bookId in(";
		if(ids!=null && ids.length>0) {
			for (int i = 0; i < ids.length; i++) {
				sql+=i==ids.length-1?ids[i]:ids[i]+",";
			}
		}
		sql+=")";
		return sql;
	}
	
	public int delete(String... ids)throws SQLException{
		Connection conn=this.openConnection();
		String sql=concatSQl(ids);
		int count=this.update(conn, sql, null);
		this.closeConnection();
		return count;
	}
	
	public Book loadUpdateBOok(int bookId)throws SQLException{
		Book b=null;
		Connection conn=this.openConnection();
		String sql="select * from book where bookId=?";
		Object[] obs= {bookId};
		ResultSet rs=this.query(conn, sql, obs);
		if(rs.next()) {
			b=new Book();
			b.setBookId(rs.getInt("bookId"));
			b.setBookName(rs.getString("bookName"));
			b.setBookAuthor(rs.getString("bookAuthor"));
			b.setBookPrice(rs.getDouble("bookPrice"));
			b.setBookInfo(rs.getString("bookInfo"));
		}
		this.closeConnection();
		return b;
	}
	public int update(Book b)throws SQLException{
		Connection conn=this.openConnection();
		String sql="update book set bookName=?,bookAuthor=?,bookPrice=?,bookInfo=? where bookId=?";
		Object[] obs= {b.getBookName(),b.getBookAuthor(),b.getBookPrice(),b.getBookInfo(),b.getBookId()};
		int count=this.update(conn, sql, obs);
		this.closeConnection();
		return count;
	}
}
