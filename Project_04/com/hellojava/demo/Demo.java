package com.hellojava.demo;
import java.util.HashSet;
public class Demo{
	public static void main(String[] agrs){
		//Set�ӿ� Collection �ӿ���һ���ӽӿ�
		//�������ظ�Ԫ�� list��ͬ 
		//HashSet ����hashCodeֵ �� equals �ж����������Ƿ���� 
		HashSet<User> hashSet=new HashSet<>();
		for(int i=0;i<10;i++){
			User user=new User();
			user.setUserId(1);
			user.setUserName("����"+(i+1));
			user.setUserPwd("a111");
			
			hashSet.add(user);
		}
		
		System.out.println(hashSet.size());
		
		/*
		Test<String> test=new Test<String>();
		test.show("hello");
		
		Test<Integer> test1=new Test<Integer>();
	
		
		System.out.println(10^2);

			*/
	}
}