package com.hellojava.tools;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyContext {
	private HttpServletRequest req;
	private HttpServletResponse resp;
	private ServletConfig config;
	private ServletContext context;
	public HttpServletRequest getReq() {
		return req;
	}
	public void setReq(HttpServletRequest req) {
		this.req = req;
	}
	public HttpServletResponse getResp() {
		return resp;
	}
	public void setResp(HttpServletResponse resp) {
		this.resp = resp;
	}
	public ServletConfig getConfig() {
		return config;
	}
	public void setConfig(ServletConfig config) {
		this.config = config;
	}
	public ServletContext getContext() {
		return context;
	}
	public void setContext(ServletContext context) {
		this.context = context;
	}
}
