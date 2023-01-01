package com.threebee.starentertainment.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import com.threebee.starentertainment.dto.ResponseDto;
import com.threebee.starentertainment.entity.NewsEntity;
import com.threebee.starentertainment.service.NewsService;

@Controller
public class FanBoardController {

	@GetMapping("/board")
	public String fetchBoard(Model model) {
		
		return "fanboard/home";
	}
	
	@GetMapping("/board/write")
	public String fetchWrite(Model model) {
		
		return "fanboard/write";
	}
}
