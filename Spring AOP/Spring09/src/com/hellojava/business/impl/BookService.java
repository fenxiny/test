package com.hellojava.business.impl;

import com.hellojava.business.IBookService;

public class BookService implements IBookService{

	@Override
	public void save() {
		System.out.println("BookService save()");
	}

}
