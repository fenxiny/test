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
	 * ����ķ��� ����ֵ-1 С��  1 ����  0 ����
	 */
	public int compareTo(User user) {
		return new Integer(this.getUserId()).compareTo(user.getUserId());
	}
}
