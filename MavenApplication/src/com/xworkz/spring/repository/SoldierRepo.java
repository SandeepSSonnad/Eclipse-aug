package com.xworkz.spring.repository;

import com.xworkz.spring.dto.SoldierDTO;

public interface SoldierRepo {

	boolean save(SoldierDTO dto);
	
}
