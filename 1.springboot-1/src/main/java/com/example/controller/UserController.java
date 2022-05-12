package com.example.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.domain.User;
import com.example.form.UserForm;
import com.example.service.UserService;

@Controller
@RequestMapping("/user")

public class UserController {
	@RequestMapping("")
	public String index(Model model) {

		Map<Integer, String> hobbyMap = new LinkedHashMap<>();
		hobbyMap.put(1, "野球");
		hobbyMap.put(2, "サッカー");
		hobbyMap.put(3, "テニス");

		model.addAttribute("hobbyMap", hobbyMap);
		return "user/input";
	}
	
	@ModelAttribute
	public UserForm setUpForm() {
		return new UserForm();
	}

	@RequestMapping("/create")
	public String create(@Validated UserForm form,BindingResult result,RedirectAttributes redirectAttributes,Model model) {

		if(result.hasErrors()) {
			return index(model);
		}
		User user = new User();
		BeanUtils.copyProperties(form, user);

		List<String> hobbyList = new ArrayList<>();
		for (Integer hobbyCode : form.getHobbyList()) {
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
		user.setHobbyList(hobbyList);
		UserService userService = new UserService();
		user = userService.save(user);

		redirectAttributes.addFlashAttribute("user", user);

		return "redirect:/user/toresult";

	}

	@RequestMapping("/toresult")
	public String toresult() {
		return "user/result";
	}
}