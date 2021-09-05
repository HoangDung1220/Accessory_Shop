package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

import com.laptrinhjavaweb.entity.MenuEntity;

@Controller
public interface MenuRepository extends JpaRepository<MenuEntity, Integer> {

}
