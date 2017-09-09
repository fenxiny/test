package com.hellojava.web.servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "checkCodeServlet", urlPatterns = { "/checkCodeServlet" })
public class CheckCodeServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int width=120,height=25;
		BufferedImage image=new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		//得到当前图片的画笔或画布
		Graphics g=image.getGraphics();
		Random r=new Random();
		g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
		g.fillRect(0, 0, width, height);
		
		//绘制干扰线
		for (int i = 0; i < 10; i++) {
			g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
			g.drawLine(r.nextInt(width), r.nextInt(height), r.nextInt(width), r.nextInt(height));
		}
		
		//绘制文字
		String base="A0B1C2D3E4F5G6H7I8J9KLMNOPQRSTUVWSYZ";
		String clientCode="",serverCode="";
		for (int i = 0; i < 4; i++) {
			char c=base.charAt(r.nextInt(base.length()));
			serverCode+=c;
			clientCode+=i==3?c:c+" ";
		}
		
		request.getSession().setAttribute("serverCode", serverCode);
		g.setFont(new Font("宋体",Font.BOLD,24));
		g.drawString(clientCode, 15, 20);
		
		ImageIO.write(image, "JPEG", response.getOutputStream());
	}

}
