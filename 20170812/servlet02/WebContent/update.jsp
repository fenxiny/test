<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/td.css">
</head>
<body>
	<div style="margin: auto; margin-top: 100px; width: 300px; border: solid 1px; border-bottom: none;">
		<form action="updateServlet" method="post">
			<table style="width: 100%" cellspacing="0">
				<tr>
					<td align="right">名称:</td>
					<td>
						<input type="hidden" name="bookId" value="${sessionScope.updateBook.bookId}">
						<input type="text" name="bookName" value="${sessionScope.updateBook.bookName}"/>
					</td>
				</tr>
				<tr>
					<td align="right">作者:</td>
					<td>
						<input type="text" name="bookAuthor" value="${sessionScope.updateBook.bookAuthor}"/>
					</td>
				</tr>
				<tr>
					<td align="right">价格:</td>
					<td>
						<input type="text" name="bookPrice" value="${sessionScope.updateBook.bookPrice }"/>
					</td>
				</tr>
				<tr>
					<td align="right">信息:</td>
					<td>
						<input type="text" name="bookInfo" value="${sessionScope.updateBook.bookInfo }"/>
					</td>
				</tr>
				
				<tr>
					<td colspan="2" align="right">
						<button type="submit">确定</button>
						<button type="reset">取消</button>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>