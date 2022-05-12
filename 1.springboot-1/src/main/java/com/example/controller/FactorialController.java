package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.CalcService;
import com.example.service.FactorialService;

@Controller
@RequestMapping("/factorial")
public class FactorialController {
	
	@Autowired
	private FactorialService service;
	
	@RequestMapping("/view-result")
	public String viewResult() {
		int num = 5;
		int resultOfFac = service.getFactorial(num);
		System.out.println(num + "の階上は" + resultOfFac);
		return "finished";
	}

}
