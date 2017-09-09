package com.hellojava.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hellojava.business.IUserService;
import com.hellojava.entity.User;

@Controller
public class LoginHandler {
	@Autowired
	private IUserService userService;
	@RequestMapping(value="/loginHandler")
	public String login(@RequestParam(name="userName",required=true)String uname,@RequestParam(name="userPwd",required=true)String upwd) {
		//使用RequestMapping标识的方法的参数(表单的参数名称,对象(自动封装),Model(Spring封装)存储在request范围 , Map, HttpServletRequest,HttpServletresponse,HttpSession,Locale)
		User user=new User();
		user.setUserName(uname);
		user.setUserPwd(upwd);
		boolean bool=userService.checkUser(user);
		//转到的是另外一个RequestMapping映射的方法那么添加redirect
		return bool?"redirect:loadAll":"redirect:error";
	}
}
