package com.hellojava.demo1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test {
	private static List<String> filePaths;
	static{
		filePaths=new ArrayList<>();
	}
	public static void main(String[] args) {
		search("E:\\","Demo.java");
		for(String p : filePaths){
			System.out.println(p);
		}
	}
	
	public static void search(String path,String fileName){
		File file=new File(path);
		try{
			String fn=fileName.substring(0,fileName.indexOf("."));
			boolean bool=fn.equals("*");
			String ff=!bool?fn.substring(0,fn.indexOf("*")):"";
			String ftype=fileName.substring(fileName.indexOf(".")+1);
			File[] fs=file.listFiles();
			for(File f : fs){
				if(f.isFile()){
					if(bool){
						if(f.getName().endsWith(ftype)){
							filePaths.add(f.getPath());
						}
					}else if(f.getName().indexOf(ff)>=0 && f.getName().endsWith(ftype)){
						filePaths.add(f.getPath());
					}
				}else if(f.isDirectory()){
					search(f.getPath(),fileName);
				}
			}
		}catch(Exception e){
			
		}
	}
}
