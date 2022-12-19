package com.xworkz.service;

import com.xworkz.DTO.PlaceDTO;
import com.xworkz.exception.InvalidNameException;

public interface PlaceService {
	
	boolean validateAndSave(PlaceDTO dto) throws InvalidNameException ;
	
	

}
