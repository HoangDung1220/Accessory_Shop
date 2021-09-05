package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.convert.ProductConvert;
import com.laptrinhjavaweb.dto.ProductDTO;
import com.laptrinhjavaweb.entity.ProductEntity;
import com.laptrinhjavaweb.repository.ProductRepository;
import com.laptrinhjavaweb.service.IProductService;

@Service
public class ProductService implements IProductService{
	
	
	@Autowired
	private ProductRepository product;

	public List<ProductDTO> findAll() {
		List<ProductDTO> list = new ArrayList<ProductDTO>();
		List<ProductEntity> entities = product.findAll();
		list.addAll(ProductConvert.listDTO(entities.get(0)));
		for (int i=1;i<entities.size();i++) {
			if (entities.get(i).getId()!=entities.get(i-1).getId()) {
				list.addAll(ProductConvert.listDTO(entities.get(i)));
			}
		}
		return list;
	}

	public List<ProductDTO> findNewProduct(boolean isNew) {
		List<ProductDTO> newProducts = new ArrayList<ProductDTO>();
		for (ProductEntity item : product.findByNewProduct(isNew)) {
			List<ProductDTO> entities = ProductConvert.listDTO(item);
			ProductDTO dto = entities.isEmpty()?null:entities.get(0);
			if (dto!=null) {
			newProducts.add(dto);
			}
		}
		return newProducts;
	}

	public List<ProductDTO> findByHightLight(boolean isHighLight) {
		List<ProductDTO> highProducts = new ArrayList<ProductDTO>();
		for (ProductEntity item : product.findByHightLight(isHighLight)) {
			List<ProductDTO> entities = ProductConvert.listDTO(item);
			ProductDTO dto = entities.isEmpty()?null:entities.get(0);
			if (dto!=null) {
				highProducts.add(dto);
			}
		}
		return highProducts;
	}

	public List<ProductDTO> findByCategoryId(int category_id) {
		List<ProductDTO> products = new ArrayList<ProductDTO>();
		List<ProductEntity> list = product.findByCategoryId(category_id);
		int count =0;
		for (int i=0;i<list.size();i++)
		{
			if (i==0 || (i!=0 && (list.get(i-1)!=list.get(i))))
			{
				count=0;
			}
			
			else 
	      	{
	    	 count++;
	      	}
			ProductEntity item = list.get(i);
			List<ProductDTO> entities = ProductConvert.listDTO(item);
			ProductDTO dto = entities.isEmpty()?null:entities.get(count);
			if (dto!=null) {
				products.add(dto);
			}
		}
		return products;
		
	}

	public List<ProductDTO> findByCategoryIdPageable(int category_id, Pageable pageable) {
		List<ProductEntity> list = product.findByCategoryIdPageable(category_id, pageable).getContent();
		List<ProductDTO> products = new ArrayList<ProductDTO>();
		int count =0;
		for (int i=0;i<list.size();i++)
		{
			if (i==0 || (i!=0 && (list.get(i-1)!=list.get(i))))
			{
				count=0;
			}
			
			else 
	      	{
	    	 count++;
	      	}
			ProductEntity item = list.get(i);
			List<ProductDTO> entities = ProductConvert.listDTO(item);
			ProductDTO dto = entities.isEmpty()?null:entities.get(count);
			if (dto!=null) {
				products.add(dto);
			}
		}
		return products;
		
		
	}

	public ProductDTO findOne(int id) {
		ProductEntity entity = product.findOne(id);
		ProductDTO dto = ProductConvert.listDTO(entity).isEmpty()?null:ProductConvert.listDTO(entity).get(0);
		return dto;
	}

}
