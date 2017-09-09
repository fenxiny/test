package com.hellojava.web.servlet;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hellojava.business.IBookService;
import com.hellojava.entity.Book;
import com.hellojava.tools.Action;

@Controller("loadAll")
public class LoadAllServlet extends Action {
	@Autowired
	private IBookService bookService;

	@Override
	public String execute() {
		List<Book> bookList=bookService.loadAll();
		getContext().getReq().getSession().setAttribute("bookList", bookList);
		return "index.jsp";
	}
	
}
