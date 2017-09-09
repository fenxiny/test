package com.hellojava.tools;

public abstract class Action {
	private MyContext context;
	public MyContext getContext() {
		return context;
	}
	public void setContext(MyContext context) {
		this.context = context;
	}
	public abstract String execute() ;
}
