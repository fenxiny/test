package com.hellojava.business.impl;

import com.hellojava.business.IBookService;
//ҵ�����ʵ��
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
