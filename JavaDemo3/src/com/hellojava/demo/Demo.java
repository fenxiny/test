package com.hellojava.demo;
import java.util.Random;
import java.util.TreeSet;
public class Demo {
	public static void main(String[] args) {
		Random d=new Random();
		TreeSet<Integer> treeSet=new TreeSet<>();
		//生成6个红球
		//循环是固定(6次) 错误
//		for(int i=0;i<6;i++){
//			Integer num=new Integer(d.nextInt(33)+1);
//			treeSet.add(num);
//		}
		
		
		while(treeSet.size()<6){
			Integer num=new Integer(d.nextInt(33)+1);
			treeSet.add(num);
		}
		System.out.print("红球:");
		int index=0;
		/*for(Integer i : treeSet){
			System.out.print(i+((index==treeSet.size()-1)?"":","));
			index++;
		}*/
		System.out.println(treeSet);
		
		System.out.print("\t蓝球:"+(d.nextInt(16)+1));
		
	}
}
