package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex14")

public class Ex14Controller {
	
	@RequestMapping("")
	public String index(Model model) {
		
		List<String>itemList = new ArrayList<>();
		itemList.add("山田");
		itemList.add("鈴木");
		itemList.add("伊藤");
		itemList.add("吉田");
		itemList.add("佐藤");
		model.addAttribute("itemList", itemList);
		
		return "ex-14";
	}
	

}
