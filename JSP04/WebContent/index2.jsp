<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body> 
	
	<!-- 
	<form action="index3.jsp" method="get">
		<input type="text" name="uname"/>
		<input type="checkbox" name="sid" value="1"/>
		<input type="checkbox" name="sid" value="2"/>
		<input type="checkbox" name="sid" value="3"/>
		<input type="checkbox" name="sid" value="4"/>
		<input type="submit" value="提交"/>
	</form>
 -->
 
 	<%
 		request.setAttribute("uname", "admin");
 	  	request.getRequestDispatcher("index3.jsp").forward(request, response);
 	%>
 
</body>
</html>