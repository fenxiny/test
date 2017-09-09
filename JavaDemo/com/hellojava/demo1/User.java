package com.hellojava.demo1;
public class User 
{
	//private  ˽�е� ֻ���ڵ�ǰ���з��� ���˵�ǰ��������� �����ܷ���
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
		if(userSex.equals("��") || userSex.equals("Ů")){
			this.userSex=userSex;
		}else{
			this.userSex="��";
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
