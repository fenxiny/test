<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSTL.jsp</h1>
	<!-- 在当前页面的context定义变量 -->
	<c:set var="hello" value="haha" scope="page"></c:set>
	<c:out value="${hello}"></c:out>
	<!-- 在指定的范围内移除一个hello的key -->
	<c:remove var="${hello}" scope="page"/>
	<c:out value="${hello}"></c:out>
</body>
</html>