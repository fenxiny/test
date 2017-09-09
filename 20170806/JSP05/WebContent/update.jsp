<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/main.js"></script>
<style type="text/css">
	td{
	border-bottom: dashed 1px;
	line-height: 35px;
	font-size:14px;
	}
</style>
</head>
<body>
	<div style="margin: auto; width: 300px; height: 200px; margin-top: 100px; border: solid 1px">
		<form action="updateBookHandler.jsp" method="post" id="saveBookForm">
			<table style="width:100%; height:100%;">
				<tr>
					<td align="right">名称:</td>
					<td>
						<input type="hidden" name="bookId" value="${sessionScope.updateBook.bookId}">
						<input type="text" name="bookName" value="${sessionScope.updateBook.bookName}"/>
					</td>
					<td id="bookNameInfo"></td>
				</tr>
				<tr>
					<td align="right">作者:</td>
					<td>
						<input type="text" name="bookAuthor" value="${sessionScope.updateBook.bookAuthor}"/>
					</td>
					<td id="bookAuthorInfo"></td>
				</tr>
				<tr>
					<td align="right">价格:</td>
					<td>
						<input type="text" name="bookPrice" value="${sessionScope.updateBook.bookPrice}"/>
					</td>
					<td id="bookPriceInfo"></td>					
				</tr>
				<tr>
					<td align="right">信息:</td>
					<td>
						<input type="text" name="bookInfo" value="${sessionScope.updateBook.bookInfo}"/>
					</td>
					<td id="bookInfoInfo"></td>
				</tr>
				<tr>
					<td colspan="2" align="right" style="padding-right: 20px;">
						<input type="submit" value="确定"/>
						<input type="reset" value="取消"/>
					</td>
				</tr>
				
			</table>
		</form>
	</div>
</body>
</html>