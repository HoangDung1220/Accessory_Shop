package com.laptrinhjavaweb.service;

import java.util.HashMap;

import com.laptrinhjavaweb.dto.CartDTO;

public interface ICartService {
	public HashMap<Integer, CartDTO> AddCart(int id, HashMap<Integer, CartDTO> cart);
	public int TotalQuantity(HashMap<Integer, CartDTO> cart) ;
	public double TotalPrice(HashMap<Integer, CartDTO> cart) ;
	public HashMap<Integer, CartDTO> deleteCart(int id,HashMap<Integer, CartDTO> cart);
	public HashMap<Integer, CartDTO> updateCart(int id,int quantity,HashMap<Integer, CartDTO> cart);




}
