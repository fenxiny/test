package com.hellojava.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hellojava.business.IBookService;
import com.hellojava.entity.Book;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		IBookService bookService=context.getBean(IBookService.class);
		//bookService.loadAll().forEach(System.out::println);
//		Book b=bookService.loadById(10);
//		System.out.println(b);
		
//		Book b=new Book();
//		b.setBookId(51);
//		b.setBookName("Spring AOP");
//		b.setBookAuthor("李四");
//		b.setBookPrice(44.55);
//		b.setBookInfo("测试数据");
		
//		System.out.println(bookService.update(b));
		System.out.println(bookService.delete(51));
	}
}
