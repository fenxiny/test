package com.hellojava.demo;
import java.util.TreeSet;
// Set HashSet TreeSet
//TreeSet ����(һ����֤����� ���н���TreeSet Ԫ��һ��Ҫ���� ʵ����Comparable�ӿ�)
//�������ظ�(�ж��ظ��Ĺ�����equals����)
public class Demo1{
	public static void main(String[] args){
		TreeSet<Student> treeSet=new TreeSet<Student>();
		for(int i=0;i<10;i++){
			Student s=new Student();
			s.setStuId(1);
			s.setStuName("����"+(i+1));
			treeSet.add(s);
		}
		
		System.out.println(treeSet.size());
		
		//дһ����������һ��Ϸ���˫ɫ�����
		//˫ɫ��:����(1---33)  ����(1--16)  �������ظ�  1,4,5,11,22,32  5
		
	}
}