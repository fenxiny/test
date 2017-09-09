<%@page import="com.hellojava.business.UserService"%>
<%@page import="com.hellojava.web.entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String name=request.getParameter("userName");
	    String pwd=request.getParameter("userPwd");
	    String result="login.jsp";
	    if(name!=null && pwd!=null){
	    	User user=new User();
	    	user.setUserName(name);
	    	user.setUserPwd(pwd);
	    	
	    	UserService userService=new UserService();
	    	boolean bool=userService.checkUser(user);
	    	result=bool?"index.jsp":"error.jsp";
	    }
	    response.sendRedirect(result);
	%>
</body>
</html>