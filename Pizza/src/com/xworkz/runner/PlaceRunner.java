package com.xworkz.runner;

import java.time.LocalDateTime;

import com.xworkz.DTO.PlaceDTO;
import com.xworkz.exception.InvalidNameException;
import com.xworkz.repository.PlaceRepository;
import com.xworkz.repository.PlaceRepositoryImpl;
import com.xworkz.service.PlaceService;
import com.xworkz.service.PlaceServiceImpl;

public class PlaceRunner {

	public static void main(String[] args) {

		PlaceRepository plRepo = new PlaceRepositoryImpl();
		PlaceService plservice = new PlaceServiceImpl(plRepo);
		PlaceDTO dt = new PlaceDTO("Sandeep", "Sandeep", "Galganath", "BreathTaking Shiva Temple", "Haveri",
				"Karnataka", "India");
		dt.setCreatedDate(LocalDateTime.now());
		dt.setUpdatedDate(LocalDateTime.now());
		try {
			plservice.validateAndSave(dt);

		} catch (InvalidNameException ex) {
			ex.getMessage();
		}

	}

}
