package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex15")
public class Ex15Controller {
	@RequestMapping("")
	public String index(Model model) {
		
		List<List<String>>teamList = new ArrayList<>();
		
		List<String>titleList = new ArrayList<>();
		titleList.add("チーム名");
		titleList.add("先鋒");
		titleList.add("中堅");
		titleList.add("大将");
		teamList.add(titleList);
		
		List<String> memberAList = new ArrayList<>();
		memberAList.add("Aチーム");
		memberAList.add("伊藤");
		memberAList.add("佐藤");
		memberAList.add("齋藤");
		teamList.add(memberAList);
		
		List<String>memberBList = new ArrayList<>();
		memberBList.add("Bチーム");
		memberBList.add("宇賀");
		memberBList.add("伊賀");
		memberBList.add("大賀");
		teamList.add(memberBList);
		
		List<String> memberCList = new ArrayList<>();
		memberCList.add("Cチーム");
		memberCList.add("池田");
		memberCList.add("糸田");
		memberCList.add("山田");
		teamList.add(memberCList);
		
		model.addAttribute("teamList",teamList);
		return "ex-15";
	}
}
