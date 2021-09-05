package com.laptrinhjavaweb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.laptrinhjavaweb.entity.BillDetailEntity;

@Repository
public interface BillDetailRepository extends CrudRepository<BillDetailEntity, Integer>{

}
