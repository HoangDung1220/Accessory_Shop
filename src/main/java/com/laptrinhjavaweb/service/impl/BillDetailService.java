package com.laptrinhjavaweb.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.dto.CartDTO;
import com.laptrinhjavaweb.entity.BillDetailEntity;
import com.laptrinhjavaweb.repository.BillDetailRepository;
import com.laptrinhjavaweb.repository.BillRepository;
import com.laptrinhjavaweb.repository.ProductRepository;
import com.laptrinhjavaweb.service.IBillDetailService;

@Service
public class BillDetailService implements IBillDetailService{

	@Autowired
	private BillDetailRepository billDetailRepository;
	
	@Autowired
	private BillService billService;
	
	@Autowired
	private ProductRepository productRepo;
	
	@Autowired
	private BillRepository billRepo;
	
	public void SaveDetailBill(HashMap<Integer, CartDTO> cart) {
		int id_bill = billService.findID();
		
		for (Map.Entry<Integer, CartDTO> item: cart.entrySet()) {
			BillDetailEntity billDetail = new BillDetailEntity();
			billDetail.setProductBill(productRepo.findOne(1));
			billDetail.setQuantity(item.getValue().getQuantity());
			billDetail.setPrice(item.getValue().getTotal());
			billDetail.setBill(billRepo.findOne(id_bill));
			
			billDetailRepository.save(billDetail);
		}
		
	}

	public BillDetailEntity findOne(int id) {
		
		return billDetailRepository.findOne(id);
	}

}
