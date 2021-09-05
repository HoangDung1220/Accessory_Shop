package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laptrinhjavaweb.entity.SlideEntity;

@Repository
public interface SlideRepository extends JpaRepository<SlideEntity, Integer>{
	

}
