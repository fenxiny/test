package com.hellojava.database.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hellojava.database.DBManager;
import com.hellojava.web.entity.Book;

public class BookDao extends DBManager{
	public List<Book> loadAll(int page , int displayCount)throws SQLException{
		List<Book> list=new ArrayList<>();
		Connection conn=this.openConnection();
		String sql="select * from book limit ?,?";
		Object[] obs= {page*displayCount , displayCount};
		ResultSet rs=this.query(conn, sql, obs);
		while(rs.next()){
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
	
	//返回当前book表的记录数
	public int getTotalCount()throws SQLException {
		int totalCount=0;
		Connection conn=this.openConnection();
		String sql="select count(booKId) from book";
		ResultSet rs=this.query(conn, sql, null);
		if(rs.next()) {
			totalCount=rs.getInt(1);
		}
		this.closeConnection();
		return totalCount;
	}
}
