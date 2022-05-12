package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.ReceiveNameForm;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {
	
	@RequestMapping("")
	public String index() {
		return "name-form";
	}
	@RequestMapping("/receive-form")
	public String form(ReceiveNameForm rnf) {
		System.out.println("入力された名前は" + rnf.getName() + "です");
		return "finished";
	}
	
	@RequestMapping("/receive-name")
	public String receiveName(String name) {
		System.out.println("入力された名前は" + name + "です");
		return "finished";
	}
	
}
