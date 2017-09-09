package com.hellojava.demo;

import java.util.Arrays;

public class Student {
	private int stuId;
	private String stuName;
	private String stuAge;
	private String[] stuSS;
	public String[] getStuSS() {
		return stuSS;
	}
	public void setStuSS(String[] stuSS) {
		this.stuSS = stuSS;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuAge() {
		return stuAge;
	}
	public void setStuAge(String stuAge) {
		this.stuAge = stuAge;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuAge=" + stuAge + ", stuSS="
				+ Arrays.toString(stuSS) + "]";
	}
	
}
