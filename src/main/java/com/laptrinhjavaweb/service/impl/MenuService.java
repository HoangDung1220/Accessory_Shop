package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.dto.MenuDTO;
import com.laptrinhjavaweb.entity.MenuEntity;
import com.laptrinhjavaweb.repository.MenuRepository;

@Service
public class MenuService {

	@Autowired
	private MenuRepository menuRepository;
	
	public List<MenuDTO> findAll() {
		List<MenuEntity> list = menuRepository.findAll();
		List<MenuDTO> listDto = new ArrayList<MenuDTO>();
		
		for (MenuEntity menu:list) {
			MenuDTO dto = new MenuDTO();
			dto.setId(menu.getId());
			dto.setName(menu.getName());
			dto.setUrl(menu.getUrl());
			listDto.add(dto);
		}
		return listDto;
	}

}
