package com.hellojava.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class FileThread extends Thread{
	//读取的是哪个文件
	//开始位置
	//结束位置
	//写入的位置
	private File srcFile;
	private File descFile;
	private int startIndex;
	private int endIndex;
	private FileOption fileOption=new FileOption();
	public FileThread(){
		
	}
	/**
	 * 构建一个线程读取指定文件，指定的开始位置直到指定的结束位置
	 * @param srcFile 读取的文件
	 * @param descFile 写入的文件
	 * @param startIndex 开始读取的位置
	 * @param endIndex 读取的结束位置
	 */
	public FileThread(String name,File srcFile,File descFile,int startIndex,int endIndex){
		super(name);
		this.descFile=descFile;
		this.endIndex=endIndex;
		this.srcFile=srcFile;
		this.startIndex=startIndex;
	}
	
	@Override
	public void run() {
		try {
			byte[] bs=fileOption.reader(srcFile, startIndex, endIndex);
			System.out.println(this.getName()+"读取完毕");
			fileOption.writer(descFile, startIndex, bs);
			System.out.println(this.getName()+"写入完毕");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
