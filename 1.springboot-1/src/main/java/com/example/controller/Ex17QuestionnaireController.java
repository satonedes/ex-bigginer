package com.example.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.domain.Questionnaire;

@Controller
@RequestMapping("/ex17")
public class Ex17QuestionnaireController {
	
	@RequestMapping("")
	public String index(Model model) {
		
		Map<Integer,String> hobbyMap = new LinkedHashMap<>();
		hobbyMap.put(1, "野球");
		hobbyMap.put(2, "サッカー");
		hobbyMap.put(3, "テニス");
		
		model.addAttribute("hobbyMap",hobbyMap);
		
		Map<Integer,String> languageMap = new LinkedHashMap<>();
		languageMap.put(1, "Java");
		languageMap.put(2, "Japanece");
		languageMap.put(3, "English");
		
		model.addAttribute("languageMap", languageMap);
		
		return "ex-17-input";
	}
	
	@RequestMapping("/create")
	public String create(Questionnaire form,RedirectAttributes redirectAttributes) {
		
		Questionnaire qes = new Questionnaire();
		BeanUtils.copyProperties(form, qes);
		
		List<String> hobbyList = new ArrayList<>();
		for(Integer hobbyCode : form.getHobbyList()) {
			switch (hobbyCode) {
			case 1:
				hobbyList.add("野球");
				break;
			case 2:
				hobbyList.add("サッカー");
				break;
			case 3:
				hobbyList.add("テニス");
				break;
			}
		}
		qes.setHobbyList(hobbyList);
			
			
			Ex17Service service = new Ex17Service();
			ex17 = service.save(ex17);
			
			redirectAttributes.addFlashAttribute("ex17",ex17);
			
			return "ex-19-output";
		}
		
	

}
