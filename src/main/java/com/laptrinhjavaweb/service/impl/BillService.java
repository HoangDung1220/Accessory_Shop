package com.laptrinhjavaweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.entity.BillEntity;
import com.laptrinhjavaweb.repository.BillRepository;
import com.laptrinhjavaweb.service.IBillService;

@Service
public class BillService implements IBillService {

	@Autowired
	private BillRepository billRepository;
	
	public void SaveBill(BillEntity bill) {
		
		billRepository.save(bill);
	}

	public int findID() {
		
		return billRepository.findIDMax().get(0).getId();
	}

}
