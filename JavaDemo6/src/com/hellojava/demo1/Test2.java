package com.hellojava.demo1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test2 {
	//定义了查找的文件路径结果
	private static List<String> filePaths;
	//new出来
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
	 * 判断是为全盘搜索
	 * @param path 路径
	 * @param fileName 查找文件名称
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
	 * 在指定的位置查找执行的文件
	 * @param files 路径
	 * @param fileName 查找的文件名
	 */
	public static void search(File[] files,String fileName){
		for(File file : files){
			try{
				//得到当前文件的文件名称(不包含后缀名)
				String fn=fileName.substring(0,fileName.indexOf("."));
				boolean global=fn.indexOf("*")>=0?false:true;
				String fileType=fileName.substring(fileName.indexOf(".")+1);
				//文件名中*之前的字符
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

