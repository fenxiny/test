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
		//ʹ��RequestMapping��ʶ�ķ����Ĳ���(���Ĳ�������,����(�Զ���װ),Model(Spring��װ)�洢��request��Χ , Map, HttpServletRequest,HttpServletresponse,HttpSession,Locale)
		User user=new User();
		user.setUserName(uname);
		user.setUserPwd(upwd);
		boolean bool=userService.checkUser(user);
		//ת����������һ��RequestMappingӳ��ķ�����ô���redirect
		return bool?"redirect:loadAll":"redirect:error";
	}
}
