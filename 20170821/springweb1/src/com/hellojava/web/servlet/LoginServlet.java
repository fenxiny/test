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
import com.hellojava.tools.Action;

@Controller("loginServlet")
public class LoginServlet extends Action {
	@Autowired
	private IUserService userService;

	@Override
	public String execute() {
		String userName=getContext().getReq().getParameter("userName");
		String userPwd=getContext().getReq().getParameter("userPwd");
		User user=new User();
		user.setUserName(userName);
		user.setUserPwd(userPwd);
		boolean bool=userService.checkUser(user);
		return bool?"loadAll.servlet":"error.jsp";
	}
	
}
