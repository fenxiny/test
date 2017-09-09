package com.hellojava.demo;
import java.io.Serializable;
public class User implements Serializable{
	private int userId;
	private String userName;
	private String userPwd;
	
	public int getUserId(){
		return this.userId;
	}
	
	public void setUserId(int userId){
		this.userId=userId;
	}
	
	public String getUserName(){
		return this.userName;
	}
	
	public void setUserName(String userName){
		this.userName=userName;
	}
	
	public String getUserPwd(){
		return this.userPwd;
	}
	
	public void setUserPwd(String userPwd){
		this.userPwd=userPwd;
	}
	
	public String toString(){
		return "User:["+userId+"--"+userName+"---"+userPwd+"]";
	}
}