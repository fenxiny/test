package com.hellojava.demo;
import java.io.IOException;
import java.io.RandomAccessFile;
public class Test2{
	public static void main(String[] args) throws IOException{
		//һ���ļ����������� 1:�ļ����������  2:Ԫ����(�Ե�ǰ�ļ���ʽ����ʾ)
		RandomAccessFile randomAccess=new RandomAccessFile("D:\\hello.txt","rwd");
		randomAccess.seek(10);
		String content=randomAccess.readLine();
		while(content!=null){
			System.out.println(content);
			content=randomAccess.readLine();
		}
		randomAccess.close();
	}
}