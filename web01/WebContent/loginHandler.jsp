<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   String userName=request.getParameter("userName");
   String userPwd=request.getParameter("userPwd");
   System.out.println(userName+"---"+userPwd);
   if("admin".equals(userName) && "a111".equals(userPwd)){
	  // response.sendRedirect("index.jsp");
	  out.println("<h1>登陆成功</h1>");
   }else{
	   //response.sendRedirect("error.jsp");
	   
	   out.println("<h1>登陆失败</h1>");
   }
%>