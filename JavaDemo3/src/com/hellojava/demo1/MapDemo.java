package com.hellojava.demo1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		
		//Map ����key����
		//Set List �����±�
		
		//Map���ϸ��ӿ� Collection���ϸ��ӿ�
		
		HashMap<Integer, Student> hashMap=new HashMap<Integer,Student>();
		for (int i = 0; i < 10; i++) {
			Student s=new Student();
			s.setStuId(i+1);
			s.setStuName("����"+(i+1));
			//�ѵ�ǰ�����ID��Ϊmap�����е�key 
			hashMap.put(s.getStuId(), s);
		}
		
//		Student s=hashMap.get(4);
//		System.out.println(s);
		//��յ�ǰ���������е�Ԫ��
//		hashMap.clear();
		//�ж�ָ����key�Ƿ��ڵ�ǰ�ļ����д���
//		System.out.println(hashMap.containsKey(14));
		//�ж�ָ����value�Ƿ��ڵ�ǰ�ļ����д���
//		hashMap.containsValue(value)
		//�Ƿ�Ϊ��(û��Ԫ��)
//		hashMap.isEmpty();
		//�Ѳ����ļ��ϵ�Ԫ��ȫ����ӵ���ǰ������
//		hashMap.putAll(m);
		//ͨ��key�Ƴ�key��Ӧ�ĸ�Ԫ��
//		hashMap.remove(key);
		//��newVlaue �滻key��Ӧ�ĸ�oldvalue
//		hashMap.replace(key, oldValue, newValue)
		//Set<Integer> key ����
		//hashMap.keySet();
		//Set<Entry<Integer,Student>>  key---value ����
	//	hashMap.entrySet();
		//Collection<Student>  value����
		//hashMap.values();
		
		
//		for(Integer num : hashMap.keySet()){
//			System.out.println(num);
//		}
		
		hashMap.keySet().forEach(System.out::println);
		
		hashMap.entrySet().forEach(System.out::println);
		
		hashMap.values().forEach(System.out::println);
		
		//Hashtable<K, V>
		//TreeMap<K, V>
		
//		������ϵ
//		
//		Collection
//		   List
//		     ArrayList
//		     Vector
//		     Stack(ջ)
//		     LinkedList(����)
//		   Set
//		     TreeSet
//		     HashSet
//		Map
//		  HashMap
		   
	}
}
