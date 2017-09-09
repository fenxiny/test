package com.hellojava.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;

import javafx.scene.control.ButtonType;

public class Demo {
	public static void main(String[] args) throws IOException{
		//BufferedReader 功能流
		//BufferedReader reader=new BufferedReader(new FileReader("E:\\Object.java"));
		//一次读取一行(遇到\n \r 结束)
		//StringReader sr=new StringReader("你好世界");
//		StringWriter sw=new StringWriter();
//		sw.write(str);
		
		
		//BufferedWriter writer=new BufferedWriter(new FileWriter("D:\\Object.java"));
		
		//PrintWriter pw=new PrintWriter("D:\\Object.java");
		//PrintStream ps=new PrintStream("D:\\Object.java");
		
//		String content=reader.readLine();
//		while(content!=null){
//			ps.println(content);
//			content=reader.readLine();
//		}
//		reader.close();
//		ps.flush();
//		ps.close();
		
		//字节流
		//字符流 存储还是字节
		
		//转换流(InputStreamReader(字符流) 可以把字节输入流转换成字符输入流) 字节输入流 --> 字符输入流
		//OutputStreamWriter(字符流) 可以把字符输出流转换字节输出流  字符输出流 --> 字节输出流
		//构建一个字节输入流(源 磁盘文件)
//		FileInputStream fis=new FileInputStream("D:\\Jdk Resource\\java\\lang\\System.java");
//		//封装  把原始的字节输入流转换成字符输入流
//		InputStreamReader isr=new InputStreamReader(fis);
//		CharBuffer charBuffer=CharBuffer.allocate(fis.available());
//		isr.read(charBuffer);
//		isr.close();
//		System.out.println(new String(charBuffer.array()));
		
		//可以把字符流转换成字节流
//		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("D:\\hello.txt"));
//		osw.write("你好世界");
//		osw.flush();
//		osw.close();
		
	}
}
