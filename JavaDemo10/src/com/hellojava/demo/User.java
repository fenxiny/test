package com.hellojava.demo;

import java.io.Serializable;

public class User extends Person implements Serializable,Comparable<User>{
	private int userId;
	private String userName;
	private String userPwd;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	public User(){
		
	}
	
	public User(int userId,String userName,String userPwd){
		this.userId=userId;
		this.userName=userName;
		this.userPwd=userPwd;
	}

	@Override
	public int hashCode() {
		return this.userId;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPwd=" + userPwd + "]";
	}
	
	public String sayHello(String name){
		return "hello"+name;
	}

	@Override
	public boolean equals(Object obj) {
		boolean bool=false;
		if(obj instanceof User){
			User u=(User)obj;
			bool=this.getUserId()==u.getUserId();
		}
		return bool;
	}
	
	@Override
	public int compareTo(User o) {
		return new Integer(this.userId).compareTo(o.getUserId());
	}
	
	public static void hello(String name){
		System.out.println("hello"+name);
	}
}
