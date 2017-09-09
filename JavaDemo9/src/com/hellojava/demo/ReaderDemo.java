package com.hellojava.demo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;

public class ReaderDemo {
	public static void main(String[] args) throws IOException{
		File file=new File("E:\\Object.java");
		Reader reader=new FileReader(file);
		char[] cs=new char[(int)file.length()];
		
		reader.read(cs, 0, cs.length);
		
		reader.close();
		
//		for(char c : cs){
//			System.out.println(c);
//		}
//		
		Writer writer=new FileWriter("D:\\Object.java");
		writer.write(new String(cs));
		writer.flush();
		writer.close();
	}
}
