package com.laptrinhjavaweb.convert;

import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.dto.ProductDTO;
import com.laptrinhjavaweb.entity.ProductEntity;

public class ProductConvert {
	public static List<ProductDTO> listDTO(ProductEntity product){
		List<ProductDTO> list = new ArrayList<ProductDTO>();
		
		
		for (int i=0;i<product.getColors().size();i++) {
			ProductDTO dto = new ProductDTO();
			dto.setId(product.getId());
			dto.setCategory_id(product.getCategory().getId());
			dto.setCreatedAt(product.getCreatedAt());
			dto.setDetail(product.getDetail());
			dto.setHighLight(product.isHighLight());
			dto.setName(product.getName());
			dto.setNewProduct(product.isNewProduct());
			dto.setPrice(product.getPrice());
			dto.setSale(product.getSale());
			dto.setSize(product.getSize());
			dto.setTitle(product.getTitle());
			dto.setUpdatedAt(product.getUpdatedAt());
			dto.setCodeColor(product.getColors().get(i).getCode());
			dto.setNameColor(product.getColors().get(i).getName());
			dto.setImg(product.getColors().get(i).getImg());
			dto.setIdColor(product.getColors().get(i).getId());
			list.add(dto);
		}
		
		return list;
	}

}
