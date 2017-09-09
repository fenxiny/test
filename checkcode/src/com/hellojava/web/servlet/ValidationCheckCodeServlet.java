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
			//int ����   Java����  JS ��֧�� Java�Ķ���   Java����ת����һ��ͨ�õ����ݸ�ʽ���͸��ͻ���  JSON  
			response.getWriter().println(0);
		}else {
			response.getWriter().println(1);
		}
		
		response.getWriter().flush();
	}

}
