package com.hellojava.demo1;

import java.io.File;

/**
 * 遍历指定的路径下的所有的目录
 * @author Administrator
 * 指定的路径  指定查找的文件名(通配符 * ) 盘符为"" 
 */
public class Demo {
	//Properties  File
	public static void main(String[] args) {
//		traverse("D:\\");
		//返回当前计算机的所有的逻辑盘符
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
