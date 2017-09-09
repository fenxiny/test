<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<hr/>
	
	<form:form action="loginHandler" method="post" modelAttribute="user">
		账号:<form:input path="userName"/><form:errors path="userName"></form:errors><br/>
		密码:<form:password path="userPwd"/><form:errors path="userPwd"></form:errors><br/>
		年龄:<form:input path="userAge"/><form:errors path="userAge"></form:errors><br/>
		<input type="submit" value="提交"/>
	</form:form> 
</body>
</html>