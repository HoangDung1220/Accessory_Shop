package com.laptrinhjavaweb.service.impl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.dto.CartDTO;
import com.laptrinhjavaweb.repository.CartRepository;
import com.laptrinhjavaweb.service.ICartService;

@Service
public class CartService implements ICartService{

	@Autowired
	private CartRepository cartRepo;
	public HashMap<Integer, CartDTO> AddCart(int id, HashMap<Integer, CartDTO> cart) {
		return cartRepo.AddCart(id, cart);
	}
	public int TotalQuantity(HashMap<Integer, CartDTO> cart) {
		return cartRepo.TotalQuantity(cart);
	}
	public double TotalPrice(HashMap<Integer, CartDTO> cart) {
		return cartRepo.TotalPrice(cart);
	}
	public HashMap<Integer, CartDTO> deleteCart(int id, HashMap<Integer, CartDTO> cart) {
		return cartRepo.deleteCart(id, cart);
	}
	public HashMap<Integer, CartDTO> updateCart(int id, int quantity, HashMap<Integer, CartDTO> cart) {
		return cartRepo.updateCart(id, quantity, cart);
	}
	
	

}
