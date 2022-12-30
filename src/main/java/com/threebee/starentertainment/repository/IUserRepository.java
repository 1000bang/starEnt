package com.threebee.starentertainment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.threebee.starentertainment.entity.UserEntity;

public interface IUserRepository extends JpaRepository<UserEntity, Integer> {

}
