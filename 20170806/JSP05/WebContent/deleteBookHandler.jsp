<%@page import="com.hellojava.business.BookService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   	String[] ids=request.getParameterValues("ids");
	String result="error.jsp";
   	if(ids!=null && ids.length>0){
	 	BookService bookService=new BookService();
	 	boolean bool=bookService.delete(ids);
	 	if(bool){
			int pageCount=Integer.parseInt(session.getAttribute("currentPage").toString());
	 		result="loadAll.jsp?page="+pageCount;
	 	}
   	}
   	response.sendRedirect(result);
%>