package com.xworkz.service;

import com.xworkz.DTO.BakeryDTO;
import com.xworkz.exception.InvalidNameException;

public interface BakeryService {

	boolean validateAndSave(BakeryDTO dto) throws InvalidNameException;
	
}
