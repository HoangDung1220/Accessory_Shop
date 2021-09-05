package com.laptrinhjavaweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.laptrinhjavaweb.entity.BillEntity;

@Repository
public interface BillRepository extends CrudRepository<BillEntity, Integer> {

	@Query(value="select *from bill order by bill.id desc",nativeQuery = true)
	public List<BillEntity> findIDMax();
}
