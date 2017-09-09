package com.hellojava.demo;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileOption {
	public byte[] reader(File srcFile,int startIndex,int endIndex)throws IOException{
		RandomAccessFile accessFile=new RandomAccessFile(srcFile, "rwd");
		accessFile.seek(startIndex);
		byte[] bs=new byte[endIndex-startIndex];
		accessFile.readFully(bs, 0, bs.length);
		accessFile.close();
		return bs;
	}
	public void writer(File descFile,int startIndex,byte...bs)throws IOException{
		RandomAccessFile accessFile1=new RandomAccessFile(descFile, "rwd");
		accessFile1.seek(startIndex);
		accessFile1.write(bs, 0, bs.length);
		accessFile1.close();
	}
}
