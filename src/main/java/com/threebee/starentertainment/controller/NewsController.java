package com.threebee.starentertainment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewsController {

	
	@GetMapping("/news")
	public String fetchNews() {
	
		return "news/home";	
	}
	
	@GetMapping("/news/write")
	public String fetchWriteNews() {
	
		return "news/write-news";	
	}
}
