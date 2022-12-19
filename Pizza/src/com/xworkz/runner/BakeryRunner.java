package com.xworkz.runner;

import java.time.LocalDateTime;

import com.xworkz.DTO.BakeryDTO;
import com.xworkz.exception.InvalidNameException;
import com.xworkz.repository.BakeryRepoImpl;
import com.xworkz.repository.BakeryRepository;
import com.xworkz.service.BakeryService;
import com.xworkz.service.BakeryServiceImpl;

public class BakeryRunner {

	public static void main(String[] args) {

		BakeryRepository repository = new BakeryRepoImpl();
		BakeryService service = new BakeryServiceImpl(repository);
		BakeryDTO bakeryDTO = new BakeryDTO("Sandeep", "Sandeep", "Durga Parameshwari", "Owner Aunty", 9782343911l,
				"RajajiNagar", "Tea And Coffee");

		bakeryDTO.setCreatedDate(LocalDateTime.now());
		bakeryDTO.setUpdatedDate(LocalDateTime.now());
		try {
			service.validateAndSave(bakeryDTO);

		} catch (InvalidNameException e) {

			e.printStackTrace();
		}

	}

}
