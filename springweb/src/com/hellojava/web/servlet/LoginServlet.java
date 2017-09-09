package com.hellojava.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hellojava.business.IUserService;
import com.hellojava.entity.User;

@Controller("loginServlet")
public class LoginServlet extends HttpServlet {
	@Autowired
	private IUserService userService;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user=new User();
		user.setUserName(req.getParameter("userName"));
		user.setUserPwd(req.getParameter("userPwd"));
		boolean bool=userService.checkUser(user);
		resp.sendRedirect(bool?"loadAll.servlet":"error.jsp");
	}
}
