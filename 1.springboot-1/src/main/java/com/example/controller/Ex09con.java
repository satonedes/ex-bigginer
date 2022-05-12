package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex091")
public class Ex09con {
	@RequestMapping("")
	public String index() {
		return "ex-091";
	}
	
	@RequestMapping("/result")
	public String result(String mail,String pass,Model model) {
		if(mail.equals("abc@gmail.com") && pass.equals("abc")) {
			model.addAttribute("mail", mail);
			model.addAttribute("pass", pass);
			model.addAttribute("result", "成功");
			return "ex-09re";
		}else {
			model.addAttribute("mail", mail);
			model.addAttribute("pass", pass);
			model.addAttribute("result", "失敗");
			return "ex-09re";
		}
	}

}
