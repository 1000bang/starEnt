package com.threebee.starentertainment.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class UserController {

	@GetMapping({"/", "/index"})
	public String index() {
	
		System.out.println("11111");
		return "index";
		
	}
	
}
