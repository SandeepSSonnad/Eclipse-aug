package com.xworkz.runner;

import com.xworkz.DTO.RailwayStationDTO;
import com.xworkz.exception.InvalidNameException;
import com.xworkz.exception.NegativeNumberException;
import com.xworkz.repository.RailwayStationRepo;
import com.xworkz.repository.RailwayStationRepoImpl;
import com.xworkz.service.RailwayStationService;
import com.xworkz.service.RailwayStationServiceImpl;

public class RailwayStationRunner {

	public static void main(String[] args) {

		RailwayStationRepo railwayStationRepo = new RailwayStationRepoImpl();
		RailwayStationService service = new RailwayStationServiceImpl(railwayStationRepo);
		RailwayStationDTO dtto = new RailwayStationDTO("Sandeep", "Sandeep", "MailarLingeshwara Railway Station", 2,
				"Haveri", 120);

		try {
			service.validateAndSave(dtto);

		} catch (InvalidNameException vall) {
			vall.getMessage();
		} catch (NegativeNumberException neg) {
			neg.getMessage();
		}

	}

}
