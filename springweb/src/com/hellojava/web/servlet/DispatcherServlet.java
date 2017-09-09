package com.hellojava.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

//Ç°ÖÃ¿ØÖÆÆ÷
public class DispatcherServlet extends HttpServlet {
	private WebApplicationContext webApplicationContext;
	@Override
	public void init() throws ServletException {
		webApplicationContext=WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String reqServletName=req.getRequestURI().substring(req.getRequestURI().lastIndexOf("/")+1,req.getRequestURI().lastIndexOf("."));
		HttpServlet servlet=(HttpServlet) webApplicationContext.getBean(reqServletName);
		servlet.service(req,resp);
	}
}
