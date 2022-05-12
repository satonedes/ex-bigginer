package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex09")
public class Ex09controller {
	@RequestMapping("")
	public String index() {
		return "ex-09-scope-form";
	}
	@RequestMapping("/ex-09-result-scope")
	public String input(String adress,String pass,Model model) {
		if("abc@gmail.com".equals(adress) && "abc".equals(pass)) {
			model.addAttribute("adress",adress);
			model.addAttribute("pass",pass);
			model.addAttribute("result","成功");
			return "ex-09-result-scope";
			}
			else  {
				model.addAttribute("adress",adress);
				model.addAttribute("pass",pass);
				model.addAttribute("result","失敗");
			}
				return "ex-09-result-scope";
		
	}
	
}
