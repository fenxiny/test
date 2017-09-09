package com.hellojava.demo1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		//标识一个文件或者一个文件夹
		File file=new File("D:\\com\\hellojava\\demo\\hello.txt");
		//file.exists() //如果当前的文件存在则返回true 不存在返回false
//		if(!file.exists()){
//			//创建路径
//			file.mkdirs();
//			//只会创建一级目录结构
//			//file.mkdir();
//		}
		//file=new File(file.getAbsolutePath()+"\\hello.txt");
		//创建文件
		//file.createNewFile();
		//测试当前文件是否为一个可以运行文件
//		System.out.println(file.canExecute());
		//测试当前文件是否可以写入
//		System.out.println(file.canWrite());
		//测试当前文件是否可读
//		System.out.println(file.canRead());
		//删除当前file对象标识的文件
		//file.delete();
		
//		file.deleteOnExit();
		//返回的File对象(把当前File对象指向的文件返回)
//		file.getAbsoluteFile();
		//返回当前文件的路径(String)
//		file.getAbsolutePath();
		
//		file.getName();
		//父节点
//		System.out.println(file.getParent());
		
		//返回当前文件的路径
//		System.out.println(file.getPath());
		
//		System.out.println(file.getTotalSpace());
		//当前目录是否为一个绝对路径
//		file.isAbsolute();
		//判断当前文件是否为一个目录
//		file.isDirectory();
		//判断当前文件是否为一个文件
//		file.isFile();
		//是否为隐藏文件
//		file.isHidden();
		//最后的访问时间
//		Date t=new Date(file.lastModified());
//		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		System.out.println(format.format(t));
		
		
//		file.length();
		//得到当前文件夹下面的所有的文件(String[])
//		file.list();
		//返回当前文件夹下所有文件
//		file.listFiles();
		//重命名
//		file.renameTo(dest);
		
	}
}











