package com.hellojava.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
		//HashSet 判断是否为同一对象标准是hashCode()和equals()
		//TreeSet 判断是否为同一对象标准是compareTo()
//		List<String> list=new ArrayList<String>();
//		list.add("Hello");
//		list.add("Learn");
//		list.add("Hello");
//		list.add("Welcome");
//		
//		System.out.println(list.size());
//		
//		Set<String> set=new HashSet<>();
//		set.addAll(list);
//		System.out.println(set.size());
		
		
		HashMap<Integer, User> hashMap=new HashMap<>();
		for(int i=1;i<=10;i++){
			User user=new User(1+i,"张三"+(i+1));
			hashMap.put(user.getUserId(), user);
		}
		
		hashMap.values().forEach(System.out::println);
		
		for(User u : hashMap.values()){
			System.out.println(u);
		}
		
		for(Integer k : hashMap.keySet()){
			System.out.println(hashMap.get(k));
		}
		
		for(Entry<Integer, User> entry : hashMap.entrySet()){
			System.out.println(entry.getValue());
		}
	}
}
