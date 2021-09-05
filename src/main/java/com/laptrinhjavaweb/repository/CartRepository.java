package com.laptrinhjavaweb.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.laptrinhjavaweb.convert.ProductConvert;
import com.laptrinhjavaweb.dto.CartDTO;
import com.laptrinhjavaweb.dto.ProductDTO;
import com.laptrinhjavaweb.entity.ProductEntity;

@Repository
public class CartRepository {

	@Autowired
	private ProductRepository productRepo;
	
	public HashMap<Integer, CartDTO> AddCart(int id, HashMap<Integer, CartDTO> cart){
		ProductEntity entity = productRepo.findOne(id);
		ProductDTO dto = ProductConvert.listDTO(entity).isEmpty()?null:ProductConvert.listDTO(entity).get(0);
		CartDTO itemCart = new CartDTO();
	
		if (cart.containsKey(id)) {
			itemCart = cart.get(id);
			itemCart.setQuantity(itemCart.getQuantity()+1);
			itemCart.setTotal(itemCart.getTotal()+dto.getPrice());
			
		} else 
		{
			
			itemCart.setProduct(dto);
			itemCart.setQuantity(1);
			itemCart.setTotal(dto.getPrice());
		}
		cart.put(id, itemCart);
		return cart;
	}
	
	public HashMap<Integer, CartDTO> deleteCart(int id,HashMap<Integer, CartDTO> cart){
		if (cart==null) {
			return cart;
		}
		if (cart.containsKey(id)) {
			cart.remove(id);
		}
		return cart;
		
	}
	
	public HashMap<Integer, CartDTO> updateCart(int id,int quantity,HashMap<Integer, CartDTO> cart){
		if (cart==null) {
			return cart;
		}
		CartDTO itemCart = new CartDTO();
		if (cart.containsKey(id)) {
			itemCart = cart.get(id);
			itemCart.setQuantity(quantity);
			itemCart.setTotal(quantity*itemCart.getProduct().getPrice());
		}
		cart.put(id, itemCart);
		return cart;
	}
	
	public int TotalQuantity(HashMap<Integer, CartDTO> cart) {
		int count =0;
		for (Map.Entry<Integer, CartDTO> item : cart.entrySet()) {
			count += item.getValue().getQuantity();
		}
		return count;
		
	}
	
	public double TotalPrice(HashMap<Integer, CartDTO> cart) {
		double total =0;
		for (Map.Entry<Integer, CartDTO> item : cart.entrySet()) {
			total += item.getValue().getQuantity()*item.getValue().getProduct().getPrice();
		}
		return total;
	}
	
	
	
}
