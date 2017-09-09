package com.hellojava.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class FileThread extends Thread{
	//��ȡ�����ĸ��ļ�
	//��ʼλ��
	//����λ��
	//д���λ��
	private File srcFile;
	private File descFile;
	private int startIndex;
	private int endIndex;
	private FileOption fileOption=new FileOption();
	public FileThread(){
		
	}
	/**
	 * ����һ���̶߳�ȡָ���ļ���ָ���Ŀ�ʼλ��ֱ��ָ���Ľ���λ��
	 * @param srcFile ��ȡ���ļ�
	 * @param descFile д����ļ�
	 * @param startIndex ��ʼ��ȡ��λ��
	 * @param endIndex ��ȡ�Ľ���λ��
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
			System.out.println(this.getName()+"��ȡ���");
			fileOption.writer(descFile, startIndex, bs);
			System.out.println(this.getName()+"д�����");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
