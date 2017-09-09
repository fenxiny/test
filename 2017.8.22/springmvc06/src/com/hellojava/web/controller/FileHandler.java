package com.hellojava.web.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileHandler {
	@RequestMapping("/upload")
	public String uploadView(){
		return "upload";
	}
	
	@RequestMapping("/uploadHandler")
	public String uploadHandler(HttpServletRequest request,@RequestParam("uploadFile")MultipartFile file){
		//�ϴ����ļ�ԭʼ����
		String fileName=file.getOriginalFilename();
		//�õ���ǰ���̵�Զ��Ŀ¼ 
		File dir=new File(request.getServletContext().getRealPath("/upload"));
		//�ж��ϴ���Ŀ¼�Ƿ����
		if(!dir.exists()){
			dir.mkdirs();
		}
		try {
			//����һ���ֽ������(Ŀ¼Ŀ¼��+�ϴ��ļ�������)
			FileOutputStream fos=new FileOutputStream(dir.getPath()+"/"+fileName);
			//�����ֽ��������ڴ���ϴ��ļ�����
			byte[] bs=new byte[file.getInputStream().available()];
			//file.getInputStream() �����ϴ����ļ���
			file.getInputStream().read(bs, 0, bs.length);
			//�����������д��ָ���ļ���
			fos.write(bs, 0, bs.length);
			fos.flush();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "index";
	}
}
