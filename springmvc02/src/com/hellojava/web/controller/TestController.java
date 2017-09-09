package com.hellojava.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({"list"})
public class TestController {
	//@ModelAttribute 注解标识的方法会在当前所有的@RequestMapping标识的方法之前执行
//	@ModelAttribute
//	public void testModelAttribute() {
//		System.out.println("testModelAttribute");
//	}
	
	@ModelAttribute("list")
	public List<String> testModelAttribute(){
		List<String> list=new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add("hello"+(i+1));
		}
		return list;
	}
	
	@RequestMapping("/test")
	public String testView() {
		return "test";
	}
	
	@RequestMapping("/testhandler")
	public String test(@ModelAttribute("list")List<String> list) {
		System.out.println("test");
		for(String s : list) {
			System.out.println(s);
		}
		return "index";
	}
}
