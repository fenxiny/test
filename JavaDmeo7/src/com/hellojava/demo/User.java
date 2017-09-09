package com.hellojava.demo;

public class User implements Comparable<User>{
	private int userId;
	private String userName;
	
	public User(){}
	
	public User(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
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
	
	@Override
	public int hashCode() {
		return this.getUserId();
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
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + "]";
	}

	/**
	 * 排序的方法 返回值-1 小于  1 大于  0 等于
	 */
	public int compareTo(User user) {
		return new Integer(this.getUserId()).compareTo(user.getUserId());
	}
}
