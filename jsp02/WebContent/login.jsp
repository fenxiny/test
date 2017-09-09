<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="margin: auto; margin-top: 50px; width: 400px; height: 300px;">
		<form action="loginHandler.jsp" method="post">
			<table style="width: 100%" height="100%" cellspacing="10">
				<tr>
					<td align="left">用户名:</td>
					<td>
						<input type="text" name="userName"/>
					</td>
				</tr>
				<tr>
					<td align="left">密码:</td>
					<td>
						<input type="password" name="userPwd"/>
					</td>
				</tr>
				<tr>
					<td align="center" colspan="2">
						<input type="submit" value="提交"/>
						<input type="reset" value="取消"/>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>