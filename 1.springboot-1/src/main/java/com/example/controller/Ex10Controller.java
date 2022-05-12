package com.example.controller;


import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.User;

@Controller
@RequestMapping("/ex10")

public class Ex10Controller {
	
	@Autowired
	private ServletContext application;
	
	@RequestMapping("")
	public String index() {
		return "ex-10-input";
	}
	
	@RequestMapping("/ex-10-result")
	public String inputUser(String name,Integer age,String comment) {
		User user = new User();
		user.setName(name);
		user.setAge(age);
		user.setComment(comment);
		application.setAttribute("user", user);
		return "ex-10-output";
	}
	
	@RequestMapping("/to-page1")
	public String toPage1() {
		return "ex-10-output";
	}	
	
	@RequestMapping("/to-page2")
	public String toPage2() {
		return "ex-10-output2";
	}
}
