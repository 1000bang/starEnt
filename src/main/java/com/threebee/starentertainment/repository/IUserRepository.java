package com.threebee.starentertainment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.threebee.starentertainment.entity.UserEntity;

public interface IUserRepository extends JpaRepository<UserEntity, Integer> {

	@Query(value = "SELECT * FROM USERS WHERE username = ?1 AND password = ?2", nativeQuery = true)
	UserEntity findByUsernameAndPassword(String username, String password);

}
