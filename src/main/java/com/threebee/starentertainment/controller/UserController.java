package com.threebee.starentertainment.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.threebee.starentertainment.dto.ResponseDto;
import com.threebee.starentertainment.entity.UserEntity;
import com.threebee.starentertainment.service.UserService;

@Controller

public class UserController {

	@GetMapping({"/", "/index"})
	public String index() {
	
		return "index";	
	}
	
	@GetMapping("/login")
	public String login() {
		return "user/login";
	}
	@Autowired
	private UserService userService;
	
	@Autowired
	private HttpSession httpSession;
	
	
	@PostMapping("/login/check")
	public String login(Model model, UserEntity user) {
		System.out.println("user >>>" + user);
		UserEntity users = userService.login(user);
		System.out.println("users >>>" + users);
		UserEntity principal = userService.login(user);
		if(principal != null) {
			httpSession.setAttribute("principal", principal);
		}
		model.addAttribute("user",users);
		return "index";
	}
}
