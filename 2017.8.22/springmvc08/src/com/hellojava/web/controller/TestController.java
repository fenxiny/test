package com.hellojava.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@RequestMapping("/test")
	public String testView(){
		return "test";
	}
	
//	@ExceptionHandler({ArithmeticException.class,NullPointerException.class})
//	public ModelAndView exceptionHandler(Exception e){
//		System.out.println(e.getMessage());
//		ModelAndView modelAndView=new ModelAndView();
//		modelAndView.addObject("exception", e.getMessage());
//		modelAndView.setViewName("error");
//		return modelAndView;
//	}
	
	@RequestMapping("/testHandler")
	public String testHandler(int num){
		int number=10/num;
		return "index";
	}
}
