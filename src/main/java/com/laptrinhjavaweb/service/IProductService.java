package com.laptrinhjavaweb.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.laptrinhjavaweb.dto.ProductDTO;

public interface IProductService {
	public List<ProductDTO> findAll();
	public ProductDTO findOne(int id);
	public List<ProductDTO> findNewProduct(boolean isNew);
	public List<ProductDTO> findByHightLight(boolean isHighLight);
	public List<ProductDTO> findByCategoryId(int category_id);
	public List<ProductDTO> findByCategoryIdPageable(int category_id,Pageable pageable);

}
