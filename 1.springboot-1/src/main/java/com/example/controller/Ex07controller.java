package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.Ex07ReceiveForm;

@Controller
@RequestMapping("/ex07")
public class Ex07controller {
	
	@ModelAttribute
	public Ex07ReceiveForm setUpForm() {
		return new Ex07ReceiveForm();
	}
	
	@RequestMapping("")
	public String index() {
		return "ex-07";
	}
	
	@RequestMapping("/receive-calc")
	public String calc(Ex07ReceiveForm ex07receive) {
		int answer = ex07receive.getNum1() * ex07receive.getNum2() ;
		System.out.println(answer);
		return "finished";
	}

}
