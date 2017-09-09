package com.hellojava.demo;
import java.util.HashSet;
public class Demo{
	public static void main(String[] agrs){
		//Set接口 Collection 接口下一个子接口
		//不包含重复元素 list不同 
		//HashSet 根据hashCode值 和 equals 判断两个对象是否相等 
		HashSet<User> hashSet=new HashSet<>();
		for(int i=0;i<10;i++){
			User user=new User();
			user.setUserId(1);
			user.setUserName("张三"+(i+1));
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