package com.threebee.starentertainment.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.threebee.starentertainment.entity.EntertainerEntity;
import com.threebee.starentertainment.entity.FanBoardEntity;
import com.threebee.starentertainment.service.EntertainerService;
import com.threebee.starentertainment.service.FanBoardService;

@Controller
public class FanBoardController {

	@Autowired
	EntertainerService entertainerService;
	
	@Autowired
	FanBoardService fanBoardService;
	
	@GetMapping("/board")
	public String fetchBoard(Model model) {
		List<FanBoardEntity> board = fanBoardService.findAllBoard();
		
		model.addAttribute("board", board);
		return "fanboard/home";
	}
	
	@GetMapping("/board/write")
	public String fetchWrite(Model model) {
		List<EntertainerEntity> artist = entertainerService.findAllArtist();
		model.addAttribute("artist", artist);
		return "fanboard/write";
	}
}
