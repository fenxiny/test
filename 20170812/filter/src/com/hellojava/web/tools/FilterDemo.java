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
	//Filter (定义的三个方法 default init() 实现的方法  doFilter() abstract 抽象  default destroy()实现)
	//Filter 生命周期(Filter 默认是在tomcat启动的时候初始化  Servlet 第一次请求的时候初始化)
	//Filter init()  destroy() 都是调用一次  doFilter() 执行多次(被请求一次执行)
	//Init()  --  doFilter()  --  destroy()
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		//test.jsp  请求拦截 FilterDemo --> doFilter() 
		System.out.println("doFilter");
		//让当前的请求从过滤器到指定的资源
		chain.doFilter(req, resp);
	}
	
	@Override
	public void destroy() {
		System.out.println("Filter Demo Destroy");
	}

}
