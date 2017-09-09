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

	//��Ҫ�ı䵱ǰ��������жϱ�׼(��дequals)
	public boolean equals(Object obj){
		boolean bool=false;
		//instanceof �ж���ߵĶ����ǲ����ұ����ʵ��(���ݶ�̬)
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

	//equals ����true hashCode һ����ͬ
	//equals ����false hashCode ��Ҫ����ͬ
	//hashCode() һ�� ��������һ�����
	//hashCode() ��һ�� ��������Ҫ�����

	public String toString(){
		return "���:"+this.userId+"�û���:"+this.userName+"����:"+this.userPwd;
	}
}
