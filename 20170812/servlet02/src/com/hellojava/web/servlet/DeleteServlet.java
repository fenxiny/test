package com.hellojava.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hellojava.business.BookService;

public class DeleteServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String[] ids=req.getParameterValues("ids");
		String result="error.jsp";
		if(ids!=null && ids.length>0) {
			BookService bookService=new BookService();
			boolean bool=bookService.delete(ids);
			String page=req.getSession().getAttribute("page").toString();
			result=bool?"loadAll?page="+page:"error.jsp";
		}
		resp.sendRedirect(result);
	}
}
