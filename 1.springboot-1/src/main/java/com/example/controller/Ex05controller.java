package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex05")
public class Ex05controller {
	@RequestMapping("")
	public String index() {
		return "ex-05";
	}
	@RequestMapping("/receive-hobby")
		public String receive(String hobby,Model model) {
		model.addAttribute("hobby", hobby);
		return "ex-05-result-scope";
	}

}
