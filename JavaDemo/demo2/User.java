package demo2;
public class User 
{
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

	//需要改变当前对象相等判断标准(重写equals)
	public boolean equals(Object obj){
		boolean bool=false;
		//instanceof 判断左边的对象是不是右边类的实例(兼容多态)
		if(obj instanceof User){
			User u=(User)obj;
			if(this.getUserId()==u.getUserId()){
				bool=true;
			}
		}
		return bool;
	}

	public int hashCode(){
		return this.userId;
	}

	//equals 返回true hashCode 一定相同
	//equals 返回false hashCode 不要求不相同
	//hashCode() 一致 两个对象一定相等
	//hashCode() 不一致 两个对象不要求不相等

	public String toString(){
		return "编号:"+this.userId+"用户名:"+this.userName+"密码:"+this.userPwd;
	}
}

