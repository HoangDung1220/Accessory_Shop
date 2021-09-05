package com.laptrinhjavaweb.convert;

import com.laptrinhjavaweb.dto.SlideDTO;
import com.laptrinhjavaweb.entity.SlideEntity;

public class SlideConvert {
	
	public static SlideDTO EntityToDTO(SlideEntity entity) {
		SlideDTO dto = new SlideDTO();
		dto.setId(entity.getId());
		dto.setImg(entity.getImg());
		dto.setContent(entity.getContent());
		dto.setCaption(entity.getCaption());
		return dto;
	}

}
