package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.convert.SlideConvert;
import com.laptrinhjavaweb.dto.SlideDTO;
import com.laptrinhjavaweb.entity.SlideEntity;
import com.laptrinhjavaweb.repository.SlideRepository;

@Service
public class SlideService {

	@Autowired
	private SlideRepository slideRepo;
	
	public List<SlideDTO> findAll(){
		List<SlideDTO> list = new ArrayList<SlideDTO>();
		for (SlideEntity enti : slideRepo.findAll()) {
			SlideDTO dto = SlideConvert.EntityToDTO(enti);
			list.add(dto);
		}
		return list;
		
		
	}
}
