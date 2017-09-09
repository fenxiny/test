package com.hellojava.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hellojava.business.BookService;

@WebServlet(name = "deleteServlet", urlPatterns = { "/deleteServlet" })
public class DeleteServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str=request.getParameter("ids");
		String[] ids=str.split(",");
		BookService bookService=new BookService();
		boolean bool=bookService.delete(ids);
		response.getWriter().println(bool?1:0);
		response.getWriter().flush();
	}

}
