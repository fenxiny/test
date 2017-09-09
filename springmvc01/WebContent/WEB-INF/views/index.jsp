<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function addBook(){
		location.href="addbook";
	}
</script>
</head>
<body>
	<div style="margin: auto; margin-top: 100px; width: 600px; text-align: center; border: solid 1px; line-height: 30px;">
		<c:forEach items="${sessionScope.bookList}" var="book">
			<c:out value="${book.bookId}"></c:out>&nbsp;&nbsp;&nbsp;&nbsp;
			<c:out value="${book.bookName}"></c:out>&nbsp;&nbsp;&nbsp;&nbsp;
			<c:out value="${book.bookAuthor}"></c:out>&nbsp;&nbsp;&nbsp;&nbsp;
			<c:out value="${book.bookPrice}"></c:out>&nbsp;&nbsp;&nbsp;&nbsp;
			<c:out value="${book.bookInfo}"></c:out>
			<a href="delete/${book.bookId}">删除</a>
			<a href="update/${book.bookId}">修改</a>
			<br/>
		</c:forEach>
		<div style="text-align: right; margin-right: 100px; margin-top: 20px;">
			<a href="loadAll?page=1">首页</a>
			<a href="loadAll?page=${sessionScope.page-1}">上一页</a>
			<a href="loadAll?page=${sessionScope.page+1}">下一页</a>
			<a href="loadAll?page=${sessionScope.maxPage}">末页</a>
		</div>
		<div style="text-align: right; margin-right: 100px; margin-top: 20px;">
			<button type="button" onclick="addBook();">增加</button>
		</div>
	</div>
</body>
</html>