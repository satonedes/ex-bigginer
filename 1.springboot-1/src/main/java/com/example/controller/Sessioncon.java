package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/session-scope1")
public class Sessioncon {
	
	@Autowired
	private HttpSession session;
	
	@RequestMapping("")
	public String index() {
		return "session scope-form1";
	}
	@RequestMapping("/input-name1")
	public String input(String name) {
		session.setAttribute("name", name);
		return "result-session-scope4";
	}
	@RequestMapping("/topage4")
	public String page4(){
		return "result-session-scope4";
	}
	@RequestMapping("/topage5")
	public String page5() {
		return "result-session-scope5";
	}
	@RequestMapping("/topage6")
	public String page6() {
		return "result-session-scope6";
	}

}
