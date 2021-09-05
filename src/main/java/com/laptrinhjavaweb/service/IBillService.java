package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.entity.BillEntity;

public interface IBillService {
	
	public void SaveBill(BillEntity bill) ;
	public int findID();

}
