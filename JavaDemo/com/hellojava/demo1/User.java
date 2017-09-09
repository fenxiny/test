package com.hellojava.demo1;
public class User 
{
	//private  私有的 只能在当前类中访问 出了当前类的作用域 都不能访问
	private int userId;
	private String userName;
	private String userSex;
	private int userAge;

	public void setUserId(int userId){
		this.userId=userId;
	}
	
	public int getUserId(){
		return this.userId;
	}

	public void setUserName(String userName){
		this.userName=userName;
	}

	public String getUserName(){
		return this.userName;
	}

	public void setUserSex(String userSex){
		if(userSex.equals("男") || userSex.equals("女")){
			this.userSex=userSex;
		}else{
			this.userSex="男";
		}
	}

	public String getUserSex(){
		return this.userSex;
	}

	public void setUserAge(int userAge){
		if(userAge>=0 && userAge<=120){
			this.userAge=userAge;
		}else{
			this.userAge=18;
		}
	}

	public int getUserAge(){
		return this.userAge;
	}

	public User(){
	}

	public User(int userId,String userName,String userSex,int userAge){
		this.userId=userId;
		this.userName=userName;
		this.userSex=userSex;
		this.userAge=userAge;
	}

	public void show(){
		System.out.println(this.userId+"--"+this.userName+"--"+this.userSex+"--"+this.userAge);
	}
}
