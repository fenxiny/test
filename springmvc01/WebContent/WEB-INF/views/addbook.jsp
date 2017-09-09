<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="saveBook" method="post">
		名称:<input type="text" name="bookName"/><br/>
		作者:<input type="text" name="bookAuthor"/><br/>
		价格:<input type="text" name="bookPrice"/><br/>
		说明:<textarea rows="5" cols="30" name="bookInfo"></textarea>
		<input type="submit" value="增加"/>
	</form>
</body>
</html>