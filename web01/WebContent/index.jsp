<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8" errorPage="error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>index.jsp</h1>
	
	<%
		//JSP脚本
		int i=2;
	    int j=10/i;
	    //out就会把服务器的数据输出到客户端去 结果
	    out.println("<font color='red' size='+4'>"+(j+10)+"</font>");
	    
	    Date d=new Date();
	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd HH:mm:ss");
	    String datetime=sdf.format(d);
	    
	    int n=0;
	    int m=10/n;
	%>	
	<%=datetime %>
</body>
</html>