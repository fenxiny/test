<%@page import="com.hellojava.business.BookService"%>
<%@page import="com.gellojava.web.entity.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
    String bookId=request.getParameter("bookId");
	String bookName=request.getParameter("bookName");
	String bookAuthor=request.getParameter("bookAuthor");
	double bookPrice=Double.parseDouble(request.getParameter("bookPrice"));
	String bookInfo=request.getParameter("bookInfo");
	String result="error.jsp";
	if(bookId!=null){
		Book b=new Book();
		b.setBookId(Integer.parseInt(bookId));
		b.setBookName(bookName);
		b.setBookAuthor(bookAuthor);
		b.setBookPrice(bookPrice);
		b.setBookInfo(bookInfo);
		
		BookService bookService=new BookService();
		boolean bool=bookService.update(b);
		if(bool){
			int pageCount=Integer.parseInt(session.getAttribute("currentPage").toString());
	 		result="loadAll.jsp?page="+pageCount;
		}
	}
	response.sendRedirect(result);
%>