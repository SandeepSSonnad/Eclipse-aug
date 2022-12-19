package com.xworkz.runner;

import com.xworkz.DTO.BuildingDTO;
import com.xworkz.constant.BuildingType;
import com.xworkz.exception.InvalidNameException;
import com.xworkz.exception.NegativeNumberException;
import com.xworkz.repository.BuildingRepository;
import com.xworkz.repository.BuildingRepositoryImpl;
import com.xworkz.service.BuildingService;
import com.xworkz.service.BuildingServiceImpl;

public class BuildingRunner {

	public static void main(String[] args) {
		
		
		BuildingRepository buildingRepository=new BuildingRepositoryImpl();
		BuildingService buildingService=new BuildingServiceImpl(buildingRepository);
		BuildingDTO dto=new BuildingDTO("Sandeep", "Sandeep", 123, "Shobha Buildings", 50, true, true, BuildingType.PERSONAL);
		try {
			buildingService.validateAndSave(dto);
		}catch(InvalidNameException e) {
			e.getMessage();
		}
		catch(NegativeNumberException nne) {
			nne.getMessage();
		}
		
		
		
		

	}

}
