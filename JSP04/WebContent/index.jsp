<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>index.jsp</h1>
	<!-- JSP指令包含和JSP动作包含的区别(指令包含成为静态包含 动作包含成为动态包含 静态包含是组合成一个页面  动态包含是组合成两个页面)
	    A 包含 B  静态包含：A和B任何一个页面发生改变 两个页面都要重新转译，编译  动态包含 A和B修改 只会从新转译编译修改的页面 
	-->
	<%@include file="index1.jsp"%>
</body>
</html>