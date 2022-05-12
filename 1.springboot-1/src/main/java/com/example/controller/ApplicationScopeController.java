package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/application-scope")
public class ApplicationScopeController {
	@Autowired
	private ServletContext application;
	
	@RequestMapping("")
	public String count() {
		//applicationスコープからcountというキーが付いているintegerオブジェクトを取得
		Integer count = (Integer)application.getAttribute("count");
		//もし取得できなければcountを0で初期化する
		if(count == null) {
			count = 0;
		}
		// countを1増やす
		++count;
		//applicationスコープに現在のアクセス数をcountというキーをつけて格納
		application.setAttribute("count", count);
		//結果画面へフォワード
		return "result-application-scope";
	}

}
