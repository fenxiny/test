package com.hellojava.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "validationCheckCodeServlet", urlPatterns = { "/validationCheckCodeServlet" })
public class ValidationCheckCodeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userCode=request.getParameter("userCode");
		String serverCode=request.getSession().getAttribute("serverCode").toString();
		if(serverCode.equalsIgnoreCase(userCode)) {
			//int 类型   Java对象  JS 不支持 Java的对象   Java对象转换成一种通用的数据格式发送给客户端  JSON  
			response.getWriter().println(0);
		}else {
			response.getWriter().println(1);
		}
		
		response.getWriter().flush();
	}

}
