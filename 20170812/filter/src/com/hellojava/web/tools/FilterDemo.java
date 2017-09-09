package com.hellojava.web.tools;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

public class FilterDemo implements Filter {
	
	@Override
	public void init(FilterConfig filterconfig) throws ServletException {
		System.out.println("Filter Demo init");
	}
	//Filter (������������� default init() ʵ�ֵķ���  doFilter() abstract ����  default destroy()ʵ��)
	//Filter ��������(Filter Ĭ������tomcat������ʱ���ʼ��  Servlet ��һ�������ʱ���ʼ��)
	//Filter init()  destroy() ���ǵ���һ��  doFilter() ִ�ж��(������һ��ִ��)
	//Init()  --  doFilter()  --  destroy()
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		//test.jsp  �������� FilterDemo --> doFilter() 
		System.out.println("doFilter");
		//�õ�ǰ������ӹ�������ָ������Դ
		chain.doFilter(req, resp);
	}
	
	@Override
	public void destroy() {
		System.out.println("Filter Demo Destroy");
	}

}
