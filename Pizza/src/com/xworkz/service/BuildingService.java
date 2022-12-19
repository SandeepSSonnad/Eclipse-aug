package com.xworkz.service;

import com.xworkz.DTO.BuildingDTO;
import com.xworkz.exception.InvalidNameException;
import com.xworkz.exception.NegativeNumberException;

public interface BuildingService {

	boolean validateAndSave(BuildingDTO dto)throws InvalidNameException,NegativeNumberException;
}
