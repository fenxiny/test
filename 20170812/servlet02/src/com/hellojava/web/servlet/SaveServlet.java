package com.hellojava.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hellojava.business.BookService;
import com.hellojava.entity.Book;

public class SaveServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String bookName=req.getParameter("bookName");
		String bookAuthor=req.getParameter("bookAuthor");
		double bookPrice=Double.parseDouble(req.getParameter("bookPrice"));
		String bookInfo=req.getParameter("bookInfo");
		
		Book book=new Book();
		book.setBookName(bookName);
		book.setBookAuthor(bookAuthor);
		book.setBookPrice(bookPrice);
		book.setBookInfo(bookInfo);
		
		BookService bookService=new BookService();
		boolean bool=bookService.save(book);
		int displayCount=Integer.parseInt(getServletContext().getInitParameter("displayCount"));
		int maxPage=bookService.calctorMaxPage(displayCount);
		resp.sendRedirect(bool?"loadAll?page="+maxPage:"error.jsp");
	}
}
