package com.xworkz.runner;

import java.time.LocalDateTime;

import com.xworkz.DTO.HelmetDTO;
import com.xworkz.constant.Colour;
import com.xworkz.constant.Type;
import com.xworkz.repository.HelmetRepository;
import com.xworkz.repository.HelmetRepositoryImpl;
import com.xworkz.service.HelmetService;
import com.xworkz.service.HelmetServiceImpl;

public class HelmetRunner {

	public static void main(String[] args) {

		HelmetRepository repo = new HelmetRepositoryImpl();
		HelmetService service = new HelmetServiceImpl(repo);
		HelmetDTO helmetDTO = new HelmetDTO("Sandeep","Sandeep","Vega", 750D, Colour.BLACK, Type.FULL);
		helmetDTO.setCreatedBy("Sandeep");
		helmetDTO.setCreatedDate(LocalDateTime.now());
		helmetDTO.setUpdatedBy("Sandeep");
		helmetDTO.setUpdatedDate(LocalDateTime.now());
		boolean success = service.validateAndSave(helmetDTO);
		System.out.println("Success:" + success);
	}

}
