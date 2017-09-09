<%@page import="com.gellojava.web.entity.Book"%>
<%@page import="com.hellojava.business.BookService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String result="error.jsp";
    if(request.getParameter("bookId")!=null){
    	int bookId=Integer.parseInt(request.getParameter("bookId"));
    	BookService bookService=new BookService();
    	Book updateBook=bookService.loadUpdateBook(bookId);
    	session.setAttribute("updateBook", updateBook);
    	result="update.jsp";
    }
    response.sendRedirect(result);
%>