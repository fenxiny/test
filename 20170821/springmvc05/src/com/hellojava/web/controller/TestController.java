package com.hellojava.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hellojava.entity.User;

@Controller
public class TestController {
	@RequestMapping("/test")
	public String testView() {
		return "test";
	}
	
	@RequestMapping("/loadAll")
	@ResponseBody
	public List<User> loadAll(String userName,String userPwd){
		System.out.println(userName+"--"+userPwd);
		List<User> userList=new ArrayList<User>();
		for (int i = 0; i < 10; i++) {
			User user=new User(i+1,"张三"+(i+1),"a111");
			userList.add(user);
		}
		return userList;
	}
	
	@ResponseBody
	@RequestMapping("/loadById")
	public User loadById(int id) {
		return new User(id,"张三"+id,"a111");
	}
	
}
