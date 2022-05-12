package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.form.Ex19Form;

@Controller
@RequestMapping("/ex19")
public class Ex19Controller {

	@RequestMapping("")
	public String index(Model model) {
		return "ex-19";
	}
	
	@ModelAttribute
	public Ex19Form setUpForm() {
		return new Ex19Form();
	}

	@RequestMapping("/result")
	public String answer(@Validated Ex19Form form
			,BindingResult result
			,RedirectAttributes redirectAttributes
			,Model model) {
		
		if(result.hasErrors()) {
			return index(model);
		}
		
		int answer = form.getNum1() * form.getNum2();
				return "ex-19-result";
	}

}
