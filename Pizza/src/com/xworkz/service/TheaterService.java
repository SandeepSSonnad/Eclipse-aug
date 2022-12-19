package com.xworkz.service;

import com.xworkz.DTO.TheaterDTO;
import com.xworkz.exception.InvalidNameException;
import com.xworkz.exception.NegativeNumberException;

public interface TheaterService {

	boolean validateAndSave(TheaterDTO dto) throws NegativeNumberException, InvalidNameException;

}
