package com.hellojava.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//”≥…‰JSP ”Õº

@Controller
public class ViewController {
	@RequestMapping("/login")
	public String loginView() {
		return "login";
	}
	
	@RequestMapping("/error")
	public String errorView() {
		return "error";
	}
	
	@RequestMapping("/index")
	public String indexView() {
		return "index";
	}
	
	@RequestMapping("/addbook")
	public String addBookView() {
		return "addbook";
	}
	
	@RequestMapping("/updatebook")
	public String updateBookView() {
		return "update";
	}
}
