package com.rentalappapi.api.repositories;

import com.rentalappapi.api.entity.UserEntity;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {

	
	
    @Query(value = "SELECT count(*) FROM krishnendu_users", nativeQuery = true)
    int countUsers();
}