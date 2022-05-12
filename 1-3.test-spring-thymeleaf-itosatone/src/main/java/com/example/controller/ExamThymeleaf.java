package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Member;

@Controller
@RequestMapping("/exam")
public class ExamThymeleaf {
	
	@RequestMapping("")
	public String index() {
		return "ex-thymeleaf-input";
	}
	
	@RequestMapping("/result")
	public String result(Member member,Model model) {
		
		List<String>hobbyList = new ArrayList<>();
		member.setName(member.getName());
		member.setAge(member.getAge());
		member.setHobbyList(member.getHobbyList());
		model.addAttribute("hobbyList", hobbyList);
		
		return "ex-thymeleaf-result";
	}
}