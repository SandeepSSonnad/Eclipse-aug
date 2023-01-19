package com.xworkz.spring.service;

import com.xworkz.spring.dto.SoldierDTO;

public interface SoldierService {
	
	boolean validateAndSave(SoldierDTO dto);

}
