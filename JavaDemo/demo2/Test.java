package demo2;
public class Test 
{
	public static void main(String[] args) 
	{
		//User user=new User();
		//User user1=new User();
		//toString() ���԰ѵ�ǰ����ת�����ַ���
		//equals �ж����������Ƿ����(�ж��ı�׼����������ĵ�ַ�Ƿ�һ��)
		//hashCode() ���ص�ǰ�����Hash��(ɢ����(��ǰ���������+��ǰ����ĵ�ַ) ��Ϊ��ǰ����Ψһ��ʶ)
		//hashCode ���������hashCodeһ�� ���������equals����true
		// equals ����true ��Ҫ��hashCode һ��
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