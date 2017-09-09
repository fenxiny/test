package com.hellojava.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileSystem {
	public static void main(String[] args) throws IOException{
		Properties p=new Properties();
		InputStream is=FileSystem.class.getClassLoader().getResourceAsStream("threadFile.properties");
		p.load(is);
		File srcFile=new File(p.getProperty("srcFilePath"));
		FileInputStream fis=new FileInputStream(srcFile);
		int length=fis.available();
		fis.close();
		File descFile=new File(p.getProperty("descFilePath"));
		int threadCount=Integer.parseInt(p.getProperty("threadCount"));
		int threadReadCount=length/threadCount;
		
		for(int i=0;i<threadCount;i++){
			int startIndex=threadReadCount*i;
			int endIndex=threadReadCount*i+threadReadCount;
			if(i==threadCount-1){
				endIndex+=length%10;
			}
			FileThread thread=new FileThread("thread"+(i+1), srcFile, descFile, startIndex, endIndex);
			thread.start();
		}
		
	}
}
