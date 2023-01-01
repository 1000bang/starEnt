package com.threebee.starentertainment.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.threebee.starentertainment.entity.AddressEntity;
import com.threebee.starentertainment.entity.EntertainerEntity;
import com.threebee.starentertainment.entity.MembershipEntity;
import com.threebee.starentertainment.entity.NewsEntity;
import com.threebee.starentertainment.entity.UserEntity;
import com.threebee.starentertainment.model.LoginType;
import com.threebee.starentertainment.model.Membership;
import com.threebee.starentertainment.repository.IEntertainerRepository;
import com.threebee.starentertainment.repository.IMembershipRepository;
import com.threebee.starentertainment.repository.INewsRepository;
import com.threebee.starentertainment.repository.IUserRepository;

@Service
public class EntertainerService {

	
	@Autowired
	IEntertainerRepository entertainerRepository;
	
	public EntertainerEntity findEntertainerById(int id) {
		
		return entertainerRepository.findById(id).orElseThrow(()->{
			return new IllegalArgumentException("해당 연예인을 찾을 수 없습니다.");
		});
	}

	public void addArtist(EntertainerEntity artist) {
		entertainerRepository.save(artist);
		
	}
	
	

}
