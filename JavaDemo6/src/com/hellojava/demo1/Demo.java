package com.hellojava.demo1;

import java.io.File;

/**
 * ����ָ����·���µ����е�Ŀ¼
 * @author Administrator
 * ָ����·��  ָ�����ҵ��ļ���(ͨ��� * ) �̷�Ϊ"" 
 */
public class Demo {
	//Properties  File
	public static void main(String[] args) {
//		traverse("D:\\");
		//���ص�ǰ����������е��߼��̷�
		File[] fs=File.listRoots();
		
		for(File f : fs){
			traverse(f.getPath());
		}
		
	}
	
	public static void traverse(String path){
		File file=new File(path);
		
		try{
			File[] fs=file.listFiles();
			if(fs!=null){
				for(File f : fs){
					if(f.isFile()){
						System.out.println(f.getAbsolutePath());
					}else if(f.isDirectory()){
						traverse(f.getPath());
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
