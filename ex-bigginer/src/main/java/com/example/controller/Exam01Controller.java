package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Member;
import com.example.form.Exam01Form;

@Controller
@RequestMapping("/exam01")
public class Exam01Controller {
	
	@ModelAttribute
	public Exam01Form setForm() {
		return new Exam01Form();
	}
	@RequestMapping("")
	public String index() {
		return "exam01";
	}
	
	@RequestMapping("/result")
	public String result(Exam01Form form, Model model) {
		Member aaa = new Member();
		aaa.setName(form.getName());
		model.addAttribute("aaa",aaa);
		
		return "exam01-result";
	}

}
