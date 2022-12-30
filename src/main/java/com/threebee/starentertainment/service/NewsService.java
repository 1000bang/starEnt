package com.threebee.starentertainment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.threebee.starentertainment.entity.AddressEntity;
import com.threebee.starentertainment.entity.NewsEntity;
import com.threebee.starentertainment.entity.UserEntity;
import com.threebee.starentertainment.repository.INewsRepository;

@Service
public class NewsService {

	@Autowired
	INewsRepository newsRepository;
	
	public void writeNews(NewsEntity news, int user) {
		List<AddressEntity> a = new ArrayList<>();
		AddressEntity.builder().address("112").detailAddress("asd").build();
		
		
		UserEntity user1 =  UserEntity.builder()
		.username("홍길")
		.birth("12/12")
		.address(a)
		.build();
		
		news.setUser(user1);
		newsRepository.save(news);
		
	}

}
