package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.ReceiveNameFormAnswer;

@Controller
@RequestMapping("/receive-name")
public class ReceiveNameControllerAnswer {
	@ModelAttribute
	public ReceiveNameFormAnswer setUpForm() {
		return new ReceiveNameFormAnswer();
	}
	
	@RequestMapping("")
	public String index() {
		return "name-form-answer";
	}

	@RequestMapping("/receive1")
	public String receive1(String name) {
		System.out.println("入力された値は" + name + "です。");
		return "finished-answer";
	}
	
	@RequestMapping("/receive2")
	public String receive2(ReceiveNameFormAnswer form) {
		System.out.println("入力された値は" + form.getName() + "です。");
		return "finished-answer";
	}
	
}
