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
		//��ʶһ���ļ�����һ���ļ���
		File file=new File("D:\\com\\hellojava\\demo\\hello.txt");
		//file.exists() //�����ǰ���ļ������򷵻�true �����ڷ���false
//		if(!file.exists()){
//			//����·��
//			file.mkdirs();
//			//ֻ�ᴴ��һ��Ŀ¼�ṹ
//			//file.mkdir();
//		}
		//file=new File(file.getAbsolutePath()+"\\hello.txt");
		//�����ļ�
		//file.createNewFile();
		//���Ե�ǰ�ļ��Ƿ�Ϊһ�����������ļ�
//		System.out.println(file.canExecute());
		//���Ե�ǰ�ļ��Ƿ����д��
//		System.out.println(file.canWrite());
		//���Ե�ǰ�ļ��Ƿ�ɶ�
//		System.out.println(file.canRead());
		//ɾ����ǰfile�����ʶ���ļ�
		//file.delete();
		
//		file.deleteOnExit();
		//���ص�File����(�ѵ�ǰFile����ָ����ļ�����)
//		file.getAbsoluteFile();
		//���ص�ǰ�ļ���·��(String)
//		file.getAbsolutePath();
		
//		file.getName();
		//���ڵ�
//		System.out.println(file.getParent());
		
		//���ص�ǰ�ļ���·��
//		System.out.println(file.getPath());
		
//		System.out.println(file.getTotalSpace());
		//��ǰĿ¼�Ƿ�Ϊһ������·��
//		file.isAbsolute();
		//�жϵ�ǰ�ļ��Ƿ�Ϊһ��Ŀ¼
//		file.isDirectory();
		//�жϵ�ǰ�ļ��Ƿ�Ϊһ���ļ�
//		file.isFile();
		//�Ƿ�Ϊ�����ļ�
//		file.isHidden();
		//���ķ���ʱ��
//		Date t=new Date(file.lastModified());
//		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		System.out.println(format.format(t));
		
		
//		file.length();
		//�õ���ǰ�ļ�����������е��ļ�(String[])
//		file.list();
		//���ص�ǰ�ļ����������ļ�
//		file.listFiles();
		//������
//		file.renameTo(dest);
		
	}
}











