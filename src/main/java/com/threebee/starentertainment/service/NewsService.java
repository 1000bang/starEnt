package com.threebee.starentertainment.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.threebee.starentertainment.entity.AddressEntity;
import com.threebee.starentertainment.entity.MembershipEntity;
import com.threebee.starentertainment.entity.NewsEntity;
import com.threebee.starentertainment.entity.UserEntity;
import com.threebee.starentertainment.model.LoginType;
import com.threebee.starentertainment.model.Membership;
import com.threebee.starentertainment.model.UserRole;
import com.threebee.starentertainment.repository.IMembershipRepository;
import com.threebee.starentertainment.repository.INewsRepository;
import com.threebee.starentertainment.repository.IUserRepository;

@Service
public class NewsService {

	@Autowired
	INewsRepository newsRepository;
	
	@Autowired
	IUserRepository userRepository;
	
	@Autowired
	IMembershipRepository membershipRepository;
	
	public void writeNews(NewsEntity news, int user) {
		List<AddressEntity> a = new ArrayList<>();
		AddressEntity.builder().address("112").detailAddress("asd").build();
		MembershipEntity member = MembershipEntity.builder().id(0).rate(15).membership(Membership.BRONZE).build();
		membershipRepository.save(member);
		
		UserEntity user1 =  UserEntity.builder()
		.username("홍길동")
		.birth("12/12")
		.password("asd123")
		.email("123@gmail.com")
		.id(0)
		.loginType(LoginType.OWN)
		.role(UserRole.USER)
		.name("홍길동")
		.membership(member)
		.phoneNumber("010-123-123")
		.address(a)
		.build();
		
		
		userRepository.save(user1);
		System.out.println("user1 >>>>>>" +user1);
		
		news.setUser(user1);
		newsRepository.save(news);
		
	}

	public Page<NewsEntity> findAllNews(Pageable pagealbe) {
		return newsRepository.findAll(pagealbe);
		
	}

	public NewsEntity getNewsDetail(int id) {
		
		return newsRepository.findById(id).orElseThrow(()->{
			return new IllegalArgumentException("해당 글을 찾을 수 없습니다. ");
		});
	}

	@Transactional
	public void updateNews(int id, NewsEntity news) {
		NewsEntity newsItem = getNewsDetail(id);
		newsItem.setContent(news.getContent());
		newsItem.setTitle(news.getTitle());
	}

	@Transactional
	public void deleteNews(int id) {
		newsRepository.deleteById(id);
		
	}

	@Transactional
	public void setCount(int id) {
		NewsEntity newsItem = getNewsDetail(id);
		int count = newsItem.getCount();
		newsItem.setCount(count+1);
		
	}
	

}
