package com.hellojava.demo1;
public class Demo 
{
	public static void main(String[] args) 
	{
		//��Student��ı�����û�ж����κ����Ժͷ���
		//name��eat() �Ǽ̳ж���
		//new Student() �����ڴ�ռ�(Student �ڲ������Ժͷ���)
		//����:���������ʱ�����ȥ��������
		//Ĭ��һ�����ø����޲����Ĺ��췽��
		//����������Ĺ��췽���еĵ�һ��ʹ��super(����..) ָ�����ø������һ�����췽��
		//��������˹��췽����ôһ������¶�������һ���޲������췽��
		//Student s=new Student("����");
		//s.name="����";
		//s.eat();

		//Student.school="������ѧ";
	//	Teacher.school="�廪��ѧ";

		//Student s=new Student();
		//s.name="���޼�";

		//Teacher t=new Teacher();
		//t.name="������";
		//System.out.println(s.name);
		//System.out.println(t.name);


		//User user=new User(10,"����","��",100);
		//user.show();
		
		/*
		User user=new User();

		user.setUserId(1);
		user.setUserName("����");
		user.setUserSex("��");
		user.setUserAge(20);

		user.show();
		
		System.out.println(user.getUserName());
		*/

		Student s=new Student();
		s.showPersonId();
	}
}
