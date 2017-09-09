package com.hellojava.demo;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
public class Test1{
	public static void main(String[] args)throws IOException,ClassNotFoundException{
		//∑¥–Ú¡–ªØ
		FileInputStream fis=new FileInputStream("D:\\User.user");
		ObjectInputStream ois=new ObjectInputStream(fis);
		User user=(User)ois.readObject();
		System.out.println(user);
	}
}