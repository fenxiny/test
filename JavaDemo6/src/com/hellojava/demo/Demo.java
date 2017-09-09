package com.hellojava.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Demo {
	public static void main(String[] args) throws IOException{
		//¸´ÖÆ Õ³Ìù
		InputStream input=new FileInputStream("E:\\dd.txt");
		OutputStream output=new FileOutputStream("G:\\fg\\ddss.txt");
		byte[] bs=new byte[input.available()];
		input.read(bs, 0, bs.length);
		input.close();
		
		output.write(bs, 0, bs.length);
		output.flush();
		output.close();
	}
}
