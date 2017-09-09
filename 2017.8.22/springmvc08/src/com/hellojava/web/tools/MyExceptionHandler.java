package com.hellojava.web.tools;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

//@ControllerAdvice
public class MyExceptionHandler {
	//全局任何当前工程中任何的Controller 中发生指定的异常都能执行当前的方法处理
//	@ExceptionHandler({ArithmeticException.class,NullPointerException.class})
//	public ModelAndView exceptionHandler(Exception e){
//		System.out.println(e.getMessage());
//		ModelAndView modelAndView=new ModelAndView();
//		modelAndView.addObject("exception", e.getMessage());
//		modelAndView.setViewName("error");
//		return modelAndView;
//	}
}
