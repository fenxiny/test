package com.hellojava.ssm.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hellojava.ssm.business.IBookService;
import com.hellojava.ssm.business.IUserService;
import com.hellojava.ssm.entity.User;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springbean.xml");
//		IUserService userService=context.getBean(IUserService.class);
//		User user=new User();
//		user.setUserName("admin");
//		user.setUserPwd("a111");
//		System.out.println(userService.checkUser(user));
		
		IBookService bookService=context.getBean(IBookService.class);
		bookService.loadAll().forEach(System.out::println);
	}
}
