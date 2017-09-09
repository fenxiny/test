<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>欢迎使用人事管理系统</title>
</head> 
<body  background="img/bg_main.JPG" style="background-repeat:no-repeat; background-size:100%,100%" >
	<div style="margin-left: 40%; margin-top: 200px; width: 400px">
		<form action="loginServlet" method="post" id="loginForm">
			<table style="width:100%" cellspacing="10">
				<tr>
					<td align="right">账号:</td>
					<td>
						<input type="text" name="userName"/>
					</td>
					<td id="userNameInfo"></td>
				</tr>
				<tr>
					<td align="right">密码:</td>
					<td>
						<input type="password" name="userPwd"/>
					</td>
					<td id="userPwdInfo"></td>
				</tr>
				<tr>
					<td align="right">验证码:</td>
					<td>
						<img src="checkCodeServlet" width="120" height="25" align="top" id="checkCode"/><br/>
					</td>
					<td>
						<input type="text" name="userCode"/>
					</td>
				</tr>
				<tr>
					<td><span id="codeInfo"></span></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="登录"/>
						<input type="reset" value="重置"/>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>