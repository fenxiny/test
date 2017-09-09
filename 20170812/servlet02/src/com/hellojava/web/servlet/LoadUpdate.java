package com.hellojava.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hellojava.business.BookService;
import com.hellojava.entity.Book;

public class LoadUpdate extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String bookId=req.getParameter("bookId");
		String result="error.jsp";
		if(bookId!=null) {
			BookService bookService=new BookService();
			Book book=bookService.loadUpdate(Integer.parseInt(bookId));
			req.getSession().setAttribute("updateBook", book);
			result="update.jsp";
		}
		resp.sendRedirect(result);
	}
}
