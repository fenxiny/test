<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<div style="margin: auto; margin-top: 100px; width: 300px; border: solid 1px; text-align: center;">
		<form action="uploadHandler" method="post" enctype="multipart/form-data">
			文件:<input type="file" name="uploadFile"/>
			<input type="submit" value="提交"/>
		</form>
	</div>
</body>
</html>