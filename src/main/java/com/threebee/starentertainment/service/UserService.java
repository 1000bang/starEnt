package com.threebee.starentertainment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.threebee.starentertainment.entity.UserEntity;
import com.threebee.starentertainment.repository.IUserRepository;

@Service
public class UserService {

	
	@Autowired
	private IUserRepository userRepository;
	
	public UserEntity login(UserEntity user) {
		
		UserEntity userEntity = userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
		System.out.println("userEntity : " + userEntity);
		
		
		return userEntity;
	}
}
