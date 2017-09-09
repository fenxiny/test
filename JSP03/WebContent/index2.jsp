<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>index2.jsp</h1>
	<%
			//page (当前的页面) Object page = this;
			//pageContext(当前页面的环境对象) 	
			
			String name="张三";
			//Attribute(是一个Map集合) 集合 定义在pageContext内部 
			//添加
			//pageContext 范围只在当前页面 不能跨页面
			//pageContext.setAttribute("userName", name);
			//request 请求对象(tomcat接到请求就会封装成request对象) 传递 保障 页面之间是转发
			//request.setAttribute("userName",name);
			//pageContext 页面上下文 (页面有直接关系)
			//转发
			//request.getRequestDispatcher("index3.jsp").forward(request, response);
			
			//session 会话对象
			//服务器接到客户端的请求后 查找当前请求是否存在sessionID (有:取到请求携带的sessionId 会根据ID来查找服务器中的session对象 
					//没有ID，服务器会创建一个session对象，然后把Id放入到response中由response 带回客户端，客户端接收到服务器响应的sessionId
					//默认会存在浏览器的进程空间中 下一次只要是当前浏览器进程发出的请求会默认携带这个sessionId )
			//session 范围是当前浏览器进程(客户端的浏览器访问过一次 以后只要是当前浏览器进程发出的请求访问都是同一个session)
			//session.setAttribute("userName", name);
			
			application.setAttribute("userName", name);
			
			//跳转
			response.sendRedirect("index3.jsp");
	%>
</body>
</html>