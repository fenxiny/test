package com.hellojava.demo;
import java.util.Random;
import java.util.TreeSet;
public class Demo {
	public static void main(String[] args) {
		Random d=new Random();
		TreeSet<Integer> treeSet=new TreeSet<>();
		//����6������
		//ѭ���ǹ̶�(6��) ����
//		for(int i=0;i<6;i++){
//			Integer num=new Integer(d.nextInt(33)+1);
//			treeSet.add(num);
//		}
		
		
		while(treeSet.size()<6){
			Integer num=new Integer(d.nextInt(33)+1);
			treeSet.add(num);
		}
		System.out.print("����:");
		int index=0;
		/*for(Integer i : treeSet){
			System.out.print(i+((index==treeSet.size()-1)?"":","));
			index++;
		}*/
		System.out.println(treeSet);
		
		System.out.print("\t����:"+(d.nextInt(16)+1));
		
	}
}
