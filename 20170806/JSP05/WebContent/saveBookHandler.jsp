<%@page import="com.hellojava.business.BookService"%>
<%@page import="com.gellojava.web.entity.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String bookName=request.getParameter("bookName");
	String bookAuthor=request.getParameter("bookAuthor");
	double bookPrice=Double.parseDouble(request.getParameter("bookPrice"));
	String bookInfo=request.getParameter("bookInfo");
	String result="error.jsp";
	if(bookName!=null){
		Book b=new Book();
		b.setBookName(bookName);
		b.setBookAuthor(bookAuthor);
		b.setBookPrice(bookPrice);
		b.setBookInfo(bookInfo);
		
		BookService bookService=new BookService();
		boolean bool=bookService.save(b);
		if(bool){
			int displayCount=Integer.parseInt(this.getServletContext().getInitParameter("displayCount"));
			int maxPage=bookService.calctorMaxPage(displayCount);
			result="loadAll.jsp?page="+maxPage;
		}
	}
	response.sendRedirect(result);
%>