package com.hellojava.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import com.hellojava.demo.StuDao;

public class Test {
	public static void main(String[] args) throws SQLException,FileNotFoundException{
		StuDao d=new StuDao();
		d.loadAll().forEach(System.out::println);
	}
}
