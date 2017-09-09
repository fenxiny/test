<%@page import="java.io.IOException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%-- JSP注释(客户端是隐藏) --%>

	<!-- html注释(客户端可以看见) -->

	<%
		//JSP脚本  JSP表达式 JSP指令 JSP声明 (不推荐使用全局的变量(并发性比较差))
		//JSP声明 (全局)
		//JSP 整个页面都是在转译的类的_jspService()内部
		//局部变量(_jspService()方法内部的局部变量)
		String name="张三";
		//定义一个方法()
		
		hello(pageContext);
		
	%>
	
	<%! String str="hello"; %>
	
	<%!
	//转译的类中定义个方法 out _jspService() 内部定义
	public void hello(PageContext context){
		try{
			context.getOut().println("hello方法中输出的内容");
		}catch(IOException e){
			e.printStackTrace();
		}
	} %>
	
	<%=name+"--"+str %>
</body>
</html>