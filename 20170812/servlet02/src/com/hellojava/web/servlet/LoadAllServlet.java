package com.hellojava.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hellojava.business.BookService;
import com.hellojava.entity.Book;

public class LoadAllServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		BookService bookService=new BookService();
		int page=0;
		int displayCount=Integer.parseInt(this.getServletContext().getInitParameter("displayCount"));
		int maxPage=bookService.calctorMaxPage(displayCount);
		
		if(req.getParameter("page")!=null) {
			int p=Integer.parseInt(req.getParameter("page"));
			
			if(p<0) {
				p=maxPage;
			}
			
			if(p>maxPage) {
				p=0;
			}
			
			page=p;
		}
		
		List<Book> bookList=bookService.loadByPage(page, displayCount);
		req.getSession().setAttribute("bookList", bookList);
		req.getSession().setAttribute("maxPage", maxPage);
		req.getSession().setAttribute("page", page);
		resp.sendRedirect("index.jsp");
	}
}
