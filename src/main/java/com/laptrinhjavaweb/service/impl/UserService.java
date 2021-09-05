package com.laptrinhjavaweb.service.impl;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.entity.UserEntity;
import com.laptrinhjavaweb.repository.UserRepository;
import com.laptrinhjavaweb.service.IUserService;

@Service
public class UserService implements IUserService{

	@Autowired
	private UserRepository userRepo;
	public void save(UserEntity user) {
		user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12)));
		userRepo.save(user);
	}
	public UserEntity CheckAccount(UserEntity user) {
		UserEntity entity = userRepo.findOneByUser(user.getUser());
		if (entity!=null && BCrypt.checkpw(user.getPassword(), entity.getPassword())) {
			return entity;
		}
		return null;
	}

}
