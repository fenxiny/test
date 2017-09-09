package com.hellojava.demo1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test2 {
	//�����˲��ҵ��ļ�·�����
	private static List<String> filePaths;
	//new����
	static{
		filePaths=new ArrayList<>();
	}
	
	public static void main(String[] args) {
		method("","Dem*.java");
		for(String p : filePaths){
			System.out.println(p);
		}
	}
	
	/**
	 * �ж���Ϊȫ������
	 * @param path ·��
	 * @param fileName �����ļ�����
	 */
	public static void method(String path,String fileName){
		File[] fs=null;
		if(path.equals("")){
			fs=File.listRoots();
		}else{
			fs=new File[]{new File(path)};
		}
		search(fs,fileName);
	}
	
	/**
	 * ��ָ����λ�ò���ִ�е��ļ�
	 * @param files ·��
	 * @param fileName ���ҵ��ļ���
	 */
	public static void search(File[] files,String fileName){
		for(File file : files){
			try{
				//�õ���ǰ�ļ����ļ�����(��������׺��)
				String fn=fileName.substring(0,fileName.indexOf("."));
				boolean global=fn.indexOf("*")>=0?false:true;
				String fileType=fileName.substring(fileName.indexOf(".")+1);
				//�ļ�����*֮ǰ���ַ�
				String childFileName=global?"":fn.substring(0,fn.indexOf("*"));
				File[] fs=file.listFiles();
				for(File f : fs){
					if(f.isFile()){
						if(global){
							if(f.getName().equalsIgnoreCase(fileName)){
								filePaths.add(f.getPath());
							}
						}else{
							if(f.getName().endsWith(fileType)){
								boolean b=childFileName.length()>0?true:false;
								if(b){
									if(f.getName().indexOf(childFileName)>=0){
										filePaths.add(f.getPath());
									}
								}else{
									filePaths.add(f.getPath());
								}
							}
						}
					}else if(f.isDirectory()){
						search(new File[]{new File(f.getPath())},fileName);
					}
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}

