<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<div style="margin: auto; margin-top: 100px; text-align: center; border: solid 1px">
		<form action="loginServlet.servlet" method="post">
			账号:<input type="text" name="userName"/><br/>
			密码:<input type="password" name="userPwd"/></br/>
			<input type="submit" value="提交">
			<input type="reset" value="取消">
		</form>
	</div>
</body>
</html>