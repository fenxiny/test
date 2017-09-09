package com.hellojava.web.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hellojava.entity.User;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String loginView() {
		return "login";
	}
	
	@ModelAttribute("user")
	public User initForm() {
		return new User();
	}
	
	@RequestMapping("loginHandler")
	public String loginHandler(@Valid User user,Errors error) {
		if(error.getErrorCount()>0) {
			return "login";
		}else {
			System.out.println(user);
			return "index";
		}
	}
}
