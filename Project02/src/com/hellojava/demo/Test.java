package com.hellojava.demo;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
public class Test{
	public static void main(String[] args)throws IOException{
		//�ڴ�(�ڴ�����ʱ������)
		User user=new User();
		user.setUserId(1);
		user.setUserName("����");
		user.setUserPwd("a111");
		
		//�־ô洢  (��ʱ�Ե��������ñ��� ���� �־û�) 
		
		//�ڴ��user���浽����(�ڴ� -- ����  �����)
		//����һ���ļ�����һ��ͨ��(��� �洢������)
		
		//���л�(����) �ֽ� ����ת�����ֽ�(��) (�ڴ������---����(�ֽ�))
		//�����Ķ����ǲ���ֱ��ת������
		//��ʶ(serrilizab)
		//���л�(�ڴ�Ķ��󵽴��̱���)
		FileOutputStream fos=new FileOutputStream("D:\\User.user");
		ObjectOutputStream output=new ObjectOutputStream(fos);
		output.writeObject(user);
		output.flush();
		output.close();
		fos.flush();
		fos.close();
	}
}