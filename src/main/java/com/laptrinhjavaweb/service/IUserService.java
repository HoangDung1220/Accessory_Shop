package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.entity.UserEntity;

public interface IUserService {
	
	public void save(UserEntity user);
	public UserEntity CheckAccount(UserEntity user);

}
