package com.hellojava.tools;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter implements Filter {

	@Override
	public void doFilter(ServletRequest servletrequest, ServletResponse servletresponse, FilterChain filterchain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		servletrequest.setCharacterEncoding("utf-8");
		servletresponse.setCharacterEncoding("utf-8");
		filterchain.doFilter(servletrequest, servletresponse);
	}

}
