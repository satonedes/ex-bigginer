package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex04")
public class Ex04controller {
	@RequestMapping("")
	public String a() {
		return "ex-04";
	}
	
		@RequestMapping("/ex-04-success")
		public String receive(String adress,String pass) {
			if("abc@gmail.com".equals(adress) && "abc".equals(pass)) {
			return "ex-04-success";
			}
			else  {
				return "ex-04-failure";
			}
	}
}
