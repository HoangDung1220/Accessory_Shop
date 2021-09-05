package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.convert.CategoryConvert;
import com.laptrinhjavaweb.dto.CategoryDTO;
import com.laptrinhjavaweb.entity.CategoryEntity;
import com.laptrinhjavaweb.repository.CategoryRepository;
import com.laptrinhjavaweb.service.ICategoryService;

@Service
public class CategoryService implements ICategoryService {

	@Autowired
	private CategoryRepository categoryRepo;
	
	public List<CategoryDTO> findAll() {
		List<CategoryDTO> categories = new ArrayList<CategoryDTO>();
		for (CategoryEntity item : categoryRepo.findAll()) {
			CategoryDTO dto = CategoryConvert.EntityToDTO(item);
			categories.add(dto);
		}
		return categories;
	}

	
}
