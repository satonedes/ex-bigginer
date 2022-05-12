package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.from.ReceiveNameForm;

// 問3は「http://localhost:8080/receivename」のURLを叩いて確認してください（ミカミ）

@Controller
@RequestMapping("/receivename")
public class ReceiveNameController {
	
	@ModelAttribute
	private ReceiveNameForm receiveNameForm() {
		return new ReceiveNameForm();
	}
	
	@RequestMapping("")
	public String index() {
		return "name-form";
	}
	
	@RequestMapping("/finished")
	public String finished(String name) {
		System.out.println("入力された値は" + name + "です");
		return "finished";
	}
	
	// ボーナス問題は「http://localhost:8080/receivename/form」のURLを叩いて確認してください（ミカミ）
	//Formを使用するクラス
	@RequestMapping("/form")
	public String indexForm() {
		return "name-form";
	}
	
	@RequestMapping("/finishedform")
	public String finishedForm(ReceiveNameForm receiveNameForm) {
		System.out.println("入力された値は" + receiveNameForm.getName() + "です");
		return "finished";
	}
}
