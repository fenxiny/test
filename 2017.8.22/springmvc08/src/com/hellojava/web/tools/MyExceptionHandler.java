package com.hellojava.web.tools;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

//@ControllerAdvice
public class MyExceptionHandler {
	//ȫ���κε�ǰ�������κε�Controller �з���ָ�����쳣����ִ�е�ǰ�ķ�������
//	@ExceptionHandler({ArithmeticException.class,NullPointerException.class})
//	public ModelAndView exceptionHandler(Exception e){
//		System.out.println(e.getMessage());
//		ModelAndView modelAndView=new ModelAndView();
//		modelAndView.addObject("exception", e.getMessage());
//		modelAndView.setViewName("error");
//		return modelAndView;
//	}
}
