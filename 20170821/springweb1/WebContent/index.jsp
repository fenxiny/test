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
	编号&nbsp;&nbsp;&nbsp;&nbsp;名称&nbsp;&nbsp;&nbsp;&nbsp;作者&nbsp;&nbsp;&nbsp;&nbsp;
	价格&nbsp;&nbsp;&nbsp;&nbsp;说明<br/>
	<c:forEach items="${sessionScope.bookList }" var="book">
		<c:out value="${book.bookId }"></c:out>&nbsp;&nbsp;&nbsp;&nbsp;
		<c:out value="${book.bookName }"></c:out>&nbsp;&nbsp;&nbsp;&nbsp;
		<c:out value="${book.bookAuthor }"></c:out>&nbsp;&nbsp;&nbsp;&nbsp;
		<c:out value="${book.bookPrice }"></c:out>&nbsp;&nbsp;&nbsp;&nbsp;
		<c:out value="${book.bookInfo }"></c:out><br/>
	</c:forEach>
</body>
</html>