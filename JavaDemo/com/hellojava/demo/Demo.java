package com.hellojava.demo;
/*
* ����ע��
* �ṩmain����(�������)
*
*/
public class Demo 
{
	//����ע��
	public static void main(String[] args) 
	{
		//��̬���������� Ҳ����ͨ���������
		//����ͨ����������
		//��̬�������ڶ������

		//Student s=new Student();
		//s.method();
		//s.show();

		//Student.show();

		//System.out.println(Student.name);

		Student s=new Student();
		s.name="����";
		s.src="����";
		
		Student s1=new Student();

		s1.name="����";
		s1.src="����";

		//��ֵ��ַ(��Ϊs1�����洢�ľ��ǵ�ַ)
		s=s1;

		System.out.println(s.name);
		System.out.println(s.src);

		

		System.out.println(s1.name);
		System.out.println(s1.src);
	}
}