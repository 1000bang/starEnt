package com.threebee.starentertainment.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.threebee.starentertainment.dto.ResponseDto;
import com.threebee.starentertainment.entity.NewsEntity;
import com.threebee.starentertainment.service.NewsService;



@RestController
public class NewsApiController {

	@Autowired
	NewsService newsService;
	
	@PostMapping("/api/news")
	public ResponseDto<Integer> fetchSave(@RequestBody NewsEntity news
			) {
		
		System.out.println(news);
		newsService.writeNews(news, 1);
		return new ResponseDto<Integer>(HttpStatus.OK, 1);
	}
	
	@PutMapping("/api/news/{id}/update")
	public ResponseDto<Integer> fetchUpdate(@PathVariable int id, @RequestBody NewsEntity news){
		
		newsService.updateNews(id, news);
		
		return new ResponseDto<Integer>(HttpStatus.OK, 1);
	}

	
	
}
