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
		//上传的文件原始名称
		String fileName=file.getOriginalFilename();
		//得到当前工程的远程目录 
		File dir=new File(request.getServletContext().getRealPath("/upload"));
		//判断上传的目录是否存在
		if(!dir.exists()){
			dir.mkdirs();
		}
		try {
			//创建一个字节输出流(目录目录下+上传文件的名称)
			FileOutputStream fos=new FileOutputStream(dir.getPath()+"/"+fileName);
			//创建字节数组用于存放上传文件的流
			byte[] bs=new byte[file.getInputStream().available()];
			//file.getInputStream() 返回上传的文件流
			file.getInputStream().read(bs, 0, bs.length);
			//创建的输出流写入指定文件中
			fos.write(bs, 0, bs.length);
			fos.flush();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "index";
	}
}
