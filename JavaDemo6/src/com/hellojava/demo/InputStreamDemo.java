package com.hellojava.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamDemo {
	public static void main(String[] args) {
		//����һ���ļ����ֽ�������(�Ӵ��̵��ļ����ļ������ݶ�ȡ���ڴ�)
		//ͨ��
		//jpg�ļ�(�ֽ�)   �ı��ļ�(�ַ�)
		try {
			InputStream input=new FileInputStream("E:\\��ٱ�.xlsx");
			//��ǰ�Ĺ��������ܶ�ȡ���������ֽ���
			int count=input.available();
			//�رյ�ǰ����ͨ��
//			input.close();
			//��ȡһ���ֽ� 59152
			int length=count/10;
			for (int i = 0; i < 10; i++) {
				int content=i==9?i*length+count%10:i*length;
				input.skip(content);
				byte[] bs=new byte[content+length];
//				while(content<flag){s
//					int c=input.read();
//					System.out.print(c);
//					content++;
//				}
				
				input.read(bs, 0, bs.length);
				
				for(byte b : bs){
					System.out.print(b);
				}
				System.out.println();
			}
			input.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
