package com.hellojava.web.tools;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyHandlerInterceptor implements HandlerInterceptor{

	//调用目标方法之后(渲染视图之后)
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj, Exception e)
			throws Exception {
		System.out.println("afterCompletion");
	}

	//调用目标方法之后(渲染视图之前)
	public void postHandle(HttpServletRequest erquest, HttpServletResponse response, Object obj, ModelAndView modelAndView)
			throws Exception {
		System.out.println("postHandle");
	}

	//调用目标方法(使用RequestMapping注解标识的方法)之前
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
		System.out.println("preHandle");
		return true;
	}

}
