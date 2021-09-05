package com.laptrinhjavaweb.convert;

import com.laptrinhjavaweb.dto.CategoryDTO;
import com.laptrinhjavaweb.entity.CategoryEntity;

public class CategoryConvert {
	public static CategoryDTO EntityToDTO(CategoryEntity entity) {
		CategoryDTO dto = new CategoryDTO();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setDescription(entity.getDescription());
		return dto;
	}

}
