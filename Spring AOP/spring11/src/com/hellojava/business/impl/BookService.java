package com.hellojava.business.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hellojava.business.IBookService;
@Service("bookService")
public class BookService implements IBookService{

	@Override
	public void save() {
		System.out.println("bookService Save()");
	}

	@Override
	public void delete() {
		System.out.println("bookService1 Delete()");
	}
	
}
