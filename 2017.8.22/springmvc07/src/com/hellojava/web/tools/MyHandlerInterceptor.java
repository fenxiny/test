package com.hellojava.web.tools;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyHandlerInterceptor implements HandlerInterceptor{

	//����Ŀ�귽��֮��(��Ⱦ��ͼ֮��)
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj, Exception e)
			throws Exception {
		System.out.println("afterCompletion");
	}

	//����Ŀ�귽��֮��(��Ⱦ��ͼ֮ǰ)
	public void postHandle(HttpServletRequest erquest, HttpServletResponse response, Object obj, ModelAndView modelAndView)
			throws Exception {
		System.out.println("postHandle");
	}

	//����Ŀ�귽��(ʹ��RequestMappingע���ʶ�ķ���)֮ǰ
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
		System.out.println("preHandle");
		return true;
	}

}
