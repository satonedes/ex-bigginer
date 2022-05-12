package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex06")
public class Ex06controller {
	
	@RequestMapping("")
	public String index() {
		return "ex-06";
	}
@RequestMapping("/ex-06-result-scope")	
	public String receiveInfo(String name,String age,String comment,Model model) {
		model.addAttribute("name",name);
		model.addAttribute("age",age);
		model.addAttribute("comment", comment);
		return "ex-06-result-scope";
		}
}
