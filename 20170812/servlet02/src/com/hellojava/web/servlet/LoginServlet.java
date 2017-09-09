package com.hellojava.web.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hellojava.business.UserService;
import com.hellojava.entity.User;

public class LoginServlet extends HttpServlet {
	
	public LoginServlet() {
		System.out.println("loginServlet constructor");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		ServletConfig config=this.getServletConfig();
//		//��õ�ǰservlet�ľֲ�������web.xml�ļ���<servlet>�ڵ��ڲ���init-param ����
//		config.getInitParameter("displayCount");
		String result="login.jsp";
		String userName=req.getParameter("userName");
		String userPwd=req.getParameter("userPwd");
		if(userName!=null && userPwd!=null) {
			User user=new User();
			user.setUserName(userName);
			user.setUserPwd(userPwd);
			UserService userService=new UserService();
			boolean bool=userService.checkUser(user);
			if(bool) {
				result="loadAll";
				req.getSession().setAttribute("user", user);
			}else {
				result="error.jsp";
			}
		}
		resp.sendRedirect(result);
		
		//Servlet����������  JSP����������
		
		//web���̵�ȫ�ֲ�����Servlet�ľֲ�����
		
		//ȫ�ֲ���  getServletContext().getInitParameter("param-name");
		//�ֲ����� getServletConfig().getInitParameter("param-name");
		
		//config���� �� ServletConfig �ӿڵ�һ��ʵ�� 
		
		//config�����Ƿ�װ�ĵ�ǰServlet��webx.xml�ļ��е�ע��ͷ�����������Ϣ
		
		//servlet ��ʼ����ʱ��(Ĭ��ʵ�ڿͻ��˵�һ�η��ʵ�ʱ��) ���ǿ����޸�servlet����web.xml�ļ��е�
		//������Ϣ���޸�servlet�ĳ�ʼ����ʱ��(servletע��ڵ���ڲ�ʹ��<load-on-startup>1</load-on-startup>)
		
		//Servlet �� ���� init()  destroy() ִ��һ��
		//Servlet �� service() doGet() doPost() ִ�ж�ε�
		
		//jsp                  				servlet  
		//request(��ǰ�����)              request(ͨ��doGet ���� doPost�����Ĳ����õ�)
		//response(��ǰ�����)             response(ͨ��duGet ���� doPost�����Ĳ����õ�)
		//out                           PrintWriter out=response.getWriter() �õ�
		//page                          this
		//pageContext                   û��
		//session                       request.getSession() ���
		//application                   request.getServletContext(), this.getServletContext() ���
		//exception                     û��
		//config                        this.getServletConfig() ���
	}
}
