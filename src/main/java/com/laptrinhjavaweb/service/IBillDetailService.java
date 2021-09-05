package com.laptrinhjavaweb.service;

import java.util.HashMap;

import com.laptrinhjavaweb.dto.CartDTO;
import com.laptrinhjavaweb.entity.BillDetailEntity;

public interface IBillDetailService {

	public void SaveDetailBill(HashMap<Integer, CartDTO> cart);
	public BillDetailEntity findOne(int id);
}
