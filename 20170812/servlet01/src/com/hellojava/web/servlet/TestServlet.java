package com.hellojava.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet{
//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		resp.setCharacterEncoding("utf-8");
//		PrintWriter out=resp.getWriter();
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>Servlet</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("<h1>Servlet “≥√Ê</h1>");
//		out.println("</body>");
//		out.println("</html>");
//		out.flush();
//	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8");
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Get«Î«Û</h1>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
	}
	
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8");
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Post«Î«Û</h1>");
		out.println("</body>");
		out.println("</html>");
		out.flush();		
	}
	
}
