package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex01")
public class Exam01Controller {
	@Autowired
	private HttpSession model;
	
	@RequestMapping("")
	public String index() {
		return "exam01";
	}
	
	@RequestMapping("/result")
	public String login(String mail,String pass,Model model) {
		if(mail.equals("yamada@sample.com") && pass.equals("yamayama")) {
		model.addAttribute("mail", mail);
		model.addAttribute("pass", pass);
		model.addAttribute("result", "成功");
		}else {
			model.addAttribute("mail", mail);
			model.addAttribute("pass", pass);
			model.addAttribute("result", "失敗");
		}return "exam01-result";
	}

}
