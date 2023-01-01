package com.threebee.starentertainment.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.threebee.starentertainment.dto.ResponseDto;
import com.threebee.starentertainment.entity.EntertainerEntity;
import com.threebee.starentertainment.entity.FanBoardEntity;
import com.threebee.starentertainment.entity.NewsEntity;
import com.threebee.starentertainment.service.EntertainerService;
import com.threebee.starentertainment.service.FanBoardService;



@RestController
public class EntertainerApiController {

	@Autowired
	EntertainerService enterService;
	
	@PostMapping("/api/artist")
	public ResponseDto<Integer> fetchSave(@RequestBody EntertainerEntity artist) {

		enterService.addArtist(artist);
		return new ResponseDto<Integer>(HttpStatus.OK, 1);
	}
}
