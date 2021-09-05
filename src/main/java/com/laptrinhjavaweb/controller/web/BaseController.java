package com.laptrinhjavaweb.controller.web;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhjavaweb.dto.MenuDTO;
import com.laptrinhjavaweb.service.impl.MenuService;

@Controller
public class BaseController {
	@Autowired
	protected MenuService menuService;
	protected ModelAndView _mav = new ModelAndView();
	
	@PostConstruct
	protected ModelAndView Init() {
		List<MenuDTO> listMenu = menuService.findAll();
		_mav.addObject("listMenu", listMenu);
		return _mav;
	}
}
