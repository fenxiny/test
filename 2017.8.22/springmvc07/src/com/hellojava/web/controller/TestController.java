package com.hellojava.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	//url mapping  map key  /test   testView() HandlerMethod
	@RequestMapping("/test")
	public String testView(){
		System.out.println("testView");
		return "test";
	}
	
	@RequestMapping("/testHandler")
	public String testHandler(){
		System.out.println("testHandler");
		return "index";
	}
}
