package com.hellojava.demo1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Demo {
	public static void main(String[] args) throws IOException{
		//fis ������
		//bis ������ ��ӻ�����
//		FileInputStream fis=new FileInputStream("D:\\OneKey.exe");
//		BufferedInputStream bis=new BufferedInputStream(fis);
//		bis.read(b, off, len);
//		
//		BufferedOutputStream bos=new BufferedOutputStream(out)
		int width=120,height=25;
		Random r=new Random();
		//������һ��ͼƬ(�ڴ� new)
		BufferedImage image=new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		//�õ��ڴ�ͼƬ��ͼ��
		Graphics g=image.getGraphics();
		g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
		g.fillRect(0, 0, width, height);
		for(int i=0;i<10;i++){
			g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
			g.drawLine(r.nextInt(width), r.nextInt(height), r.nextInt(width), r.nextInt(height));
		}
		
		String base="abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		String code="";
		
		for(int i=0;i<4;i++){
			char c=base.charAt(r.nextInt(base.length()));
			code+=i==3?c:c+" ";
		}
		g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
		g.setFont(new Font("����",Font.BOLD,24));
		g.drawString(code, 10, 22);
		
		ImageIO.write(image,"JPEG",new File("E:\\haha.jpg"));
	}
}
