package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex01")
public class Ex01controller {
	@RequestMapping("/show-name")
	public String a() {
		return "ex-01";
	}

}
