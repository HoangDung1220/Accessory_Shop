package com.laptrinhjavaweb.convert;

import com.laptrinhjavaweb.dto.UserDTO;
import com.laptrinhjavaweb.entity.UserEntity;

public class UserConvert {

	public static UserDTO EntityToDTO(UserEntity entity) {
		UserDTO dto = new UserDTO();
		dto.setId(entity.getId());
		dto.setAddress(entity.getAddress());
		dto.setDisplay_name(entity.getDisplay_name());
		dto.setPassword(entity.getPassword());
		dto.setUser(entity.getUser());
		return dto;
	}
}
