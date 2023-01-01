package com.threebee.starentertainment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.threebee.starentertainment.entity.EntertainerEntity;

public interface IEntertainerRepository extends JpaRepository<EntertainerEntity, Integer>{

	@Query(value = "SELECT * FROM ENTERTAINER WHERE name = ?1", nativeQuery = true)
	EntertainerEntity findbyName(String name);

}
	


