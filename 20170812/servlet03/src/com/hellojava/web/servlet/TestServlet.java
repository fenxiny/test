package com.hellojava.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="testServlet",urlPatterns= {"/test","/test.do","/testServlet"},
	loadOnStartup=1,initParams= {@WebInitParam(name="hello",value="world"),
			@WebInitParam(name="displayCount",value="5")})
public class TestServlet extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		System.out.println("TestServlet Init()");
	}
	
	@Override
	public void destroy() {
		System.out.println("TestServlet destroy()");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("TestServlet service()");
		super.service(arg0, arg1);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String hello=this.getServletConfig().getInitParameter("hello");
		String displayCount=this.getServletConfig().getInitParameter("displayCount");
		System.out.println("hello:"+hello);
		System.out.println("displayCount:"+displayCount);
		System.out.println("TestServlet doPost()");
	}
}
