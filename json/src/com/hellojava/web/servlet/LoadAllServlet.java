package com.hellojava.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hellojava.business.BookService;
import com.hellojava.entity.Book;

@WebServlet(name = "loadAllServlet", urlPatterns = { "/loadAllServlet" })
public class LoadAllServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BookService bookService=new BookService();
		List<Book> bookList=bookService.loadAll();
		ObjectMapper mapper=new ObjectMapper();
		String jsonStr=mapper.writeValueAsString(bookList);
		response.setCharacterEncoding("utf-8");
		response.getWriter().println(jsonStr);
		response.getWriter().flush();
	}

}
