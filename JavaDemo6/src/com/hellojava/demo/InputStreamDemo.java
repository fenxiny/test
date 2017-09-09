package com.hellojava.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamDemo {
	public static void main(String[] args) {
		//构建一个文件的字节输入流(从磁盘的文件把文件的数据读取到内存)
		//通道
		//jpg文件(字节)   文本文件(字符)
		try {
			InputStream input=new FileInputStream("E:\\请假表.xlsx");
			//当前的构建的流能读取到的最大的字节数
			int count=input.available();
			//关闭当前的流通道
//			input.close();
			//读取一个字节 59152
			int length=count/10;
			for (int i = 0; i < 10; i++) {
				int content=i==9?i*length+count%10:i*length;
				input.skip(content);
				byte[] bs=new byte[content+length];
//				while(content<flag){s
//					int c=input.read();
//					System.out.print(c);
//					content++;
//				}
				
				input.read(bs, 0, bs.length);
				
				for(byte b : bs){
					System.out.print(b);
				}
				System.out.println();
			}
			input.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
