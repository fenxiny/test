<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>index3.jsp</h1>
	<%
		//out.println(pageContext.getAttribute("userName"));
		//out.println(request.getAttribute("userName"));
		//out.println(session.getAttribute("userName"));
		out.println(application.getAttribute("userName"));
	%>
</body>
</html>