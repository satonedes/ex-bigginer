package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {

	@Autowired
	private ServletContext application;

	@RequestMapping("")
	public String index() {
		return "exam03";
	}
	@RequestMapping("/result")
	public String result(int item1,int item2,int item3) {
		application.setAttribute("item1", item1);
		application.setAttribute("item2", item2);
		application.setAttribute("item3", item3);
		int answer = item1 + item2 + item3;
		int total = (int)(answer * 0.1 + answer);
		application.setAttribute("answer", answer);
		application.setAttribute("total", total);
		return "exam03-result";
	}
	
}