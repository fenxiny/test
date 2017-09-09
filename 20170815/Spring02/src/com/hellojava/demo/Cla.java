package com.hellojava.demo;

import java.util.List;

public class Cla {
	private List<Student> stuList;

	public List<Student> getStuList() {
		return stuList;
	}

	public void setStuList(List<Student> stuList) {
		this.stuList = stuList;
	}
	
	public void show() {
		this.stuList.forEach(System.out::println);
	}
	
}
