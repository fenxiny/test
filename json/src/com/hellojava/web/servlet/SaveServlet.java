package com.hellojava.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hellojava.business.BookService;
import com.hellojava.entity.Book;


@WebServlet(name = "saveServlet", urlPatterns = { "/saveServlet" })
public class SaveServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Book b=new Book();
		b.setBookName(request.getParameter("bookName"));
		b.setBookAuthor(request.getParameter("bookAuthor"));
		b.setBookPrice(Double.parseDouble(request.getParameter("bookPrice")));
		b.setBookInfo(request.getParameter("bookInfo"));
		
		BookService bookService=new BookService();
		boolean bool=bookService.save(b);
		response.getWriter().println(bool?1:0);
		response.getWriter().flush();
	}

}
