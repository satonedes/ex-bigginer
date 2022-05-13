package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class Exam05Controller {
	@Autowired
	Member1Repository repository;
	
	@RequestMapping(value = "/find")
	
}
