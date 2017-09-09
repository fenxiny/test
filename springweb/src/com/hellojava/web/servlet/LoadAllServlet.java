package com.hellojava.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hellojava.business.IBookService;
import com.hellojava.entity.Book;

@Controller("loadAll")
public class LoadAllServlet extends HttpServlet {
	@Autowired
	private IBookService bookService;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Book> bookList=bookService.loadAll();
		req.getSession().setAttribute("bookList", bookList);
		resp.sendRedirect("index.jsp");
	}
}
