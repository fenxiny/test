package com.hellojava.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Properties;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws IOException {
//		if(args.length>0){
//			byte[] bs=reader(args[0]);
//			writer(bs, args[1]);
//		}else{
//			System.out.println("��������ȷ");
//		}
		
//		System.setIn(in);
		
		
		//System.setIn(new FileInputStream(""));
		//�õ���ǰJVM���������(��class�ļ����ص�JVM��)
		//��ǰ���̵�src��Ŀ¼--binĿ¼
//		String path=Test.class.getClassLoader().getResource("file.properties").getPath();
//		System.out.println(path);
//		Properties properties=new Properties();
//		properties.load(new FileInputStream(path));
		//list �����ǰ�����ļ������е�����
		//properties.list(System.out);
		
		
		
//		System.out.println(properties.get("srcFilePath"));
		
		//properties.put("userName", "admin");
//		properties.setProperty("userPwd", "a111");
//		OutputStream output=new FileOutputStream(path);
//		properties.store(output,"");
//		output.flush();
//		output.close();
//		System.out.println(properties.get("dirFilePath"));
		
		
		//InputStream input=new FileInputStream("E:\\hello.txt");
		//System.in ����̨��������
		//System.setIn(input);
		//Scanner scanner=new Scanner(System.in);
		//String context=scanner.next();
		//System.setOut(new PrintStream("D:\\haha.txt"));
		//System.out.println(context);
		
	}
	
	public static byte[] reader(String filePath) throws IOException{
		InputStream input=new FileInputStream(filePath);
		int length=input.available();
		byte[] bs=new byte[length];
		input.read(bs, 0, length);
		input.close();
		return bs;
	}
	
	public static void writer(byte[] bs,String filePath)throws IOException{
		OutputStream output=new FileOutputStream(filePath);
		output.write(bs, 0, bs.length);
		output.flush();
		output.close();
	}
}
