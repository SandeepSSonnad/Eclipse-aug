package com.xworkz.service;

import com.xworkz.DTO.RailwayStationDTO;
import com.xworkz.exception.InvalidNameException;
import com.xworkz.exception.NegativeNumberException;

public interface RailwayStationService {
	
	boolean validateAndSave(RailwayStationDTO dto)throws InvalidNameException, NegativeNumberException;

}
