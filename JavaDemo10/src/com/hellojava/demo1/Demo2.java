package com.hellojava.demo1;

public class Demo2 {
	public static void main(String[] args) {
		Log log=new Log();
//		UserService userService=new UserService();
//		UserServiceProxy proxy=new UserServiceProxy(userService.getClass(), log);
//		IUserService uservice=(IUserService) proxy.getProxyInstance();
//		userService.method("李四");
//		uservice.method("张三");
		
		
		BookService bservice=new BookService();
		
		UserServiceProxy proxy=new UserServiceProxy(bservice.getClass(), log);
		
		IBookService bookService=(IBookService) proxy.getProxyInstance();
		
		bookService.hello();
	}
}
