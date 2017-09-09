<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/main.js"></script>
<link rel="stylesheet" type="text/css" href="css/td.css">
</head>
<body>
	<div style="margin: auto; margin-top: 20px; width: 600px; border: solid 1px; border-bottom: none;">
		<form action="deleteServlet" method="post" id="deleteForm">
			<table style="width: 100%" cellspacing="0">
				<tr align="center">
					<td>
					<input type="checkbox" name="all" id="all">
					编号</td>
					<td>名称</td>
					<td>作者</td>
					<td>价格</td>
					<td>信息</td>
				</tr>
				<c:forEach items="${sessionScope.bookList }" var="b">
					<tr align="center">
						<td>
						<input type="checkbox" name="ids" value="${b.bookId}">
						${b.bookId }</td>
						<td>${b.bookName }</td>
						<td>${b.bookAuthor }</td>
						<td>${b.bookPrice }</td>
						<td>${b.bookInfo }</td>
						<td><a href="loadUpdate?bookId=${b.bookId}">修改</a></td>
					</tr>	
				</c:forEach>
				
				<tr>
					<td colspan="5" align="right" style="padding-right: 50px;">
						<button type="button" id="addBookButton">增加</button>
						<button type="submit">删除</button>
					</td>
				</tr>
				
				<tr>
					<td colspan="5" align="right">
						<a href="loadAll?page=0">首页</a>
						<a href="loadAll?page=${sessionScope.page-1}">上一页</a>
						<a href="loadAll?page=${sessionScope.page+1 }">下一页</a>
						<a href="loadAll?page=${sessionScope.maxPage }">末页</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>