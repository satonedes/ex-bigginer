package com.example.controllerrensyu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex051")
public class Ren05 {
	@RequestMapping("")
	public String index() {
		return "ex-05";
	}
	@RequestMapping("/receive-hobby")
	public String king(String hobby){
		System.out.println(hobby);
		return "finished";
	}

}
