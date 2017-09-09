package demo2;
public class Test 
{
	public static void main(String[] args) 
	{
		//User user=new User();
		//User user1=new User();
		//toString() 可以把当前对象转换成字符串
		//equals 判断两个对象是否相等(判定的标准是两个对象的地址是否一致)
		//hashCode() 返回当前对象的Hash码(散列码(当前对象的内容+当前对象的地址) 作为当前对象唯一标识)
		//hashCode 两个对象的hashCode一致 两个对象的equals返回true
		// equals 返回true 不要求hashCode 一致
		//System.out.println(user.equals(user1));

		User u=new User();
		u.setUserId(1);
		u.setUserName("administrator");
		u.setUserPwd("a111");

		User u1=new User();
		u1.setUserId(1);
		u1.setUserName("administrator");
		u1.setUserPwd("a111");

		//User u2=u;
		//u2.setUserId(2);
		
		//System.out.println(u.equals(u1));
		//System.out.println(u.hashCode());
		//System.out.println(u1.hashCode());


		System.out.println(u.equals(new Student()));
	}
}
