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
import com.threebee.starentertainment.entity.FanBoardEntity;
import com.threebee.starentertainment.entity.MembershipEntity;
import com.threebee.starentertainment.entity.NewsEntity;
import com.threebee.starentertainment.entity.UserEntity;
import com.threebee.starentertainment.model.LoginType;
import com.threebee.starentertainment.model.Membership;
import com.threebee.starentertainment.repository.IEntertainerRepository;
import com.threebee.starentertainment.repository.IFanBoardRepository;
import com.threebee.starentertainment.repository.IMembershipRepository;
import com.threebee.starentertainment.repository.INewsRepository;
import com.threebee.starentertainment.repository.IUserRepository;

@Service
public class FanBoardService {

	@Autowired
	IFanBoardRepository fanBoardRepository;
	
	@Autowired
	IEntertainerRepository entertainerRepository;
	
	@Transactional
	public void writeBoard(String name, FanBoardEntity fanEntity) {
		EntertainerEntity enter = entertainerRepository.findbyName(name);
		fanEntity.setEntertainer(enter);
		fanBoardRepository.save(fanEntity);
		
	}

	
	

}
