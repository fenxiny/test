package com.hellojava.demo1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		
		//Map 按照key索引
		//Set List 按照下标
		
		//Map集合根接口 Collection集合根接口
		
		HashMap<Integer, Student> hashMap=new HashMap<Integer,Student>();
		for (int i = 0; i < 10; i++) {
			Student s=new Student();
			s.setStuId(i+1);
			s.setStuName("张三"+(i+1));
			//把当前对象的ID作为map集合中的key 
			hashMap.put(s.getStuId(), s);
		}
		
//		Student s=hashMap.get(4);
//		System.out.println(s);
		//清空当前集合中所有的元素
//		hashMap.clear();
		//判断指定的key是否在当前的集合中存在
//		System.out.println(hashMap.containsKey(14));
		//判断指定的value是否在当前的集合中存在
//		hashMap.containsValue(value)
		//是否为空(没有元素)
//		hashMap.isEmpty();
		//把参数的集合的元素全部添加到当前集合中
//		hashMap.putAll(m);
		//通过key移除key对应哪个元素
//		hashMap.remove(key);
		//用newVlaue 替换key对应哪个oldvalue
//		hashMap.replace(key, oldValue, newValue)
		//Set<Integer> key 集合
		//hashMap.keySet();
		//Set<Entry<Integer,Student>>  key---value 集合
	//	hashMap.entrySet();
		//Collection<Student>  value集合
		//hashMap.values();
		
		
//		for(Integer num : hashMap.keySet()){
//			System.out.println(num);
//		}
		
		hashMap.keySet().forEach(System.out::println);
		
		hashMap.entrySet().forEach(System.out::println);
		
		hashMap.values().forEach(System.out::println);
		
		//Hashtable<K, V>
		//TreeMap<K, V>
		
//		集合体系
//		
//		Collection
//		   List
//		     ArrayList
//		     Vector
//		     Stack(栈)
//		     LinkedList(链表)
//		   Set
//		     TreeSet
//		     HashSet
//		Map
//		  HashMap
		   
	}
}
