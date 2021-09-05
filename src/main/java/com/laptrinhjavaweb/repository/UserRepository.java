package com.laptrinhjavaweb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.laptrinhjavaweb.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer>{
	public UserEntity findOneByUser(String user);

}
