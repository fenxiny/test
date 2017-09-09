package com.hellojava.demo;
import java.util.TreeSet;
// Set HashSet TreeSet
//TreeSet 排序(一定保证有序的 所有进入TreeSet 元素一定要保障 实现了Comparable接口)
//不允许重复(判断重复的规则是equals方法)
public class Demo1{
	public static void main(String[] args){
		TreeSet<Student> treeSet=new TreeSet<Student>();
		for(int i=0;i<10;i++){
			Student s=new Student();
			s.setStuId(1);
			s.setStuName("张三"+(i+1));
			treeSet.add(s);
		}
		
		System.out.println(treeSet.size());
		
		//写一个程序生成一组合法的双色球号码
		//双色球:红球(1---33)  蓝球(1--16)  红球不能重复  1,4,5,11,22,32  5
		
	}
}