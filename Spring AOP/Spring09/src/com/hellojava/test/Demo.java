package com.hellojava.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hellojava.business.IBookService;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		IBookService bookService=(IBookService) applicationContext.getBean("proxy");
		bookService.save();
		
//		IBookService bookService=(IBookService) applicationContext.getBean("bookService");
//		bookService.save();
	}
}
