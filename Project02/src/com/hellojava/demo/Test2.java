package com.hellojava.demo;
import java.io.IOException;
import java.io.RandomAccessFile;
public class Test2{
	public static void main(String[] args) throws IOException{
		//一个文件包含两部分 1:文件本身的内容  2:元数据(对当前文件格式的显示)
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