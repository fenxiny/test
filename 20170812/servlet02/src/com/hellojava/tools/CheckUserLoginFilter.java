package com.hellojava.tools;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//判断每一个请求是否登陆
public class CheckUserLoginFilter implements Filter {

	@Override
	public void doFilter(ServletRequest servletrequest, ServletResponse servletresponse, FilterChain filterchain)
			throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest)servletrequest;
		HttpServletResponse resp=(HttpServletResponse)servletresponse;
		List<String> list=new ArrayList<>();
		list.add("login.jsp");
		list.add("loginServlet");
		list.add("error.jsp");
		//得到用户当前请求的资源
		///servlet02/index.jsp
		//req.getRequestURI();
		String userResourceName=req.getRequestURI().substring(req.getRequestURI().lastIndexOf("/")+1);
		if(req.getSession().getAttribute("user")!=null || list.contains(userResourceName)) {
			filterchain.doFilter(servletrequest, servletresponse);
		}else {
			if(userResourceName.endsWith("jpg") || userResourceName.endsWith("css") || userResourceName.endsWith("js")) {
				filterchain.doFilter(servletrequest, servletresponse);
			}else {
				resp.sendRedirect("login.jsp");
			}
		}
	}

}
