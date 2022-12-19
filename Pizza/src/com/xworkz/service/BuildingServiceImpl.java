package com.xworkz.service;

import com.xworkz.DTO.BuildingDTO;
import com.xworkz.constant.BuildingType;
import com.xworkz.exception.InvalidNameException;
import com.xworkz.exception.NegativeNumberException;
import com.xworkz.repository.BuildingRepository;

public class BuildingServiceImpl implements BuildingService {

	BuildingRepository buildingRepository;
	
	public BuildingServiceImpl(BuildingRepository buildingRepository) {
		System.out.println("Running Service Implement Constructor");
		this.buildingRepository=buildingRepository;
	}
	
	@Override
	public boolean validateAndSave(BuildingDTO dto) throws InvalidNameException, NegativeNumberException {
		System.out.println("Running validateAndSave:"+dto);
		int no=dto.getNo();
		String name=dto.getName();
		int floors=dto.getFloors();
		BuildingType type=dto.getType();
		
		boolean validNo=false;
		boolean validName=false;
		boolean validFloors=false;
		boolean validLift=true;
		boolean validparking=true;
		boolean validType=false;
		
		if(no > 0 && no <= 1000) {
			System.out.println("Valid Building Number");
			validNo=true;
		}else {
			System.out.println("InValid Building Number");
			throw new NegativeNumberException();
		}
		if(name != null && name.length()>=3 && name.length()<=20) {
			System.out.println("Valid Building Name");
			validName=true;
		}else {
			System.out.println("InValid Building Name");
			throw new InvalidNameException();
		}
		if(floors > 0 && floors <= 100) {
			System.out.println("Valid Floors");
			validFloors=true;
		}else {
			System.out.println("InValid Floors");
			throw new NegativeNumberException();
		}
		
		if(type != null && type ==BuildingType.COMMERCIAL || type== BuildingType.PERSONAL) {
			System.out.println("Valid Building Type");
			validType=true;
		}else {
			System.out.println("InValid Building Type");
			throw new InvalidNameException();
		}
		
		
		
		if(validNo && validName && validFloors && validType && validLift && validparking) {
			System.out.println("All The Parameter is Correct And Ready To save To Repository");
			boolean saved=this.buildingRepository.save(dto);
			System.out.println("Saved:"+saved);
			return saved;
		}
		
		
		return false;
	}

}
