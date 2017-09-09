package com.hellojava.dao;

import java.sql.SQLException;
import java.util.List;

import com.hellojava.entity.Book;

public interface IBookDao {
	public List<Book> loadAll() throws SQLException;
}
