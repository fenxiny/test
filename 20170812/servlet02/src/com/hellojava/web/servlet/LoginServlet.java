package com.hellojava.web.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hellojava.business.UserService;
import com.hellojava.entity.User;

public class LoginServlet extends HttpServlet {
	
	public LoginServlet() {
		System.out.println("loginServlet constructor");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		ServletConfig config=this.getServletConfig();
//		//获得当前servlet的局部参数在web.xml文件中<servlet>节点内部的init-param 参数
//		config.getInitParameter("displayCount");
		String result="login.jsp";
		String userName=req.getParameter("userName");
		String userPwd=req.getParameter("userPwd");
		if(userName!=null && userPwd!=null) {
			User user=new User();
			user.setUserName(userName);
			user.setUserPwd(userPwd);
			UserService userService=new UserService();
			boolean bool=userService.checkUser(user);
			if(bool) {
				result="loadAll";
				req.getSession().setAttribute("user", user);
			}else {
				result="error.jsp";
			}
		}
		resp.sendRedirect(result);
		
		//Servlet的生命周期  JSP的生命周期
		
		//web工程的全局参数和Servlet的局部参数
		
		//全局参数  getServletContext().getInitParameter("param-name");
		//局部参数 getServletConfig().getInitParameter("param-name");
		
		//config对象 是 ServletConfig 接口的一个实例 
		
		//config对象是封装的当前Servlet在webx.xml文件中的注册和发布的配置信息
		
		//servlet 初始化的时机(默认实在客户端第一次访问的时候) 但是可以修改servlet的在web.xml文件中的
		//配置信息来修改servlet的初始化的时机(servlet注册节点的内部使用<load-on-startup>1</load-on-startup>)
		
		//Servlet 的 方法 init()  destroy() 执行一次
		//Servlet 的 service() doGet() doPost() 执行多次的
		
		//jsp                  				servlet  
		//request(提前定义的)              request(通过doGet 或者 doPost方法的参数得到)
		//response(提前定义的)             response(通过duGet 或者 doPost方法的参数得到)
		//out                           PrintWriter out=response.getWriter() 得到
		//page                          this
		//pageContext                   没有
		//session                       request.getSession() 获得
		//application                   request.getServletContext(), this.getServletContext() 获得
		//exception                     没有
		//config                        this.getServletConfig() 获得
	}
}
