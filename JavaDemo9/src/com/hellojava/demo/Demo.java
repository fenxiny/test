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
		//BufferedReader ������
		//BufferedReader reader=new BufferedReader(new FileReader("E:\\Object.java"));
		//һ�ζ�ȡһ��(����\n \r ����)
		//StringReader sr=new StringReader("�������");
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
		
		//�ֽ���
		//�ַ��� �洢�����ֽ�
		
		//ת����(InputStreamReader(�ַ���) ���԰��ֽ�������ת�����ַ�������) �ֽ������� --> �ַ�������
		//OutputStreamWriter(�ַ���) ���԰��ַ������ת���ֽ������  �ַ������ --> �ֽ������
		//����һ���ֽ�������(Դ �����ļ�)
//		FileInputStream fis=new FileInputStream("D:\\Jdk Resource\\java\\lang\\System.java");
//		//��װ  ��ԭʼ���ֽ�������ת�����ַ�������
//		InputStreamReader isr=new InputStreamReader(fis);
//		CharBuffer charBuffer=CharBuffer.allocate(fis.available());
//		isr.read(charBuffer);
//		isr.close();
//		System.out.println(new String(charBuffer.array()));
		
		//���԰��ַ���ת�����ֽ���
//		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("D:\\hello.txt"));
//		osw.write("�������");
//		osw.flush();
//		osw.close();
		
	}
}
