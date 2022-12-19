package com.xworkz.service;

import com.xworkz.DTO.RailwayStationDTO;
import com.xworkz.exception.InvalidNameException;
import com.xworkz.exception.NegativeNumberException;
import com.xworkz.repository.RailwayStationRepo;

public class RailwayStationServiceImpl implements RailwayStationService {

	RailwayStationRepo railwayStationRepo;

	public RailwayStationServiceImpl(RailwayStationRepo railwayStationRepo) {
		System.out.println("Running Service Implment Constructor");
		this.railwayStationRepo = railwayStationRepo;
	}

	@Override
	public boolean validateAndSave(RailwayStationDTO dto)throws InvalidNameException, NegativeNumberException {
		System.out.println("Running validateAndSave:"+dto);
		String name = dto.getName();
		int noOfPlatforms = dto.getNoOfPlatforms();
		String area = dto.getArea();
		double ticket = dto.getPlatformTicketPrice();
		boolean validName = false;
		boolean validNoOfPlatforms = false;
		boolean validArea = false;
		boolean validTicket = false;

		if (name != null && name.length() >= 4 && name.length() <= 40) {
			System.out.println("Valid Railway Station Name");
			validName=true;
		}else {
			System.out.println("Invalid Railway Station Name");
			throw new InvalidNameException();
		}
		if(noOfPlatforms > 0) {
			System.out.println("Valid Platform Number");
			validNoOfPlatforms=true;
		}else {
			System.out.println("InValid Platform Number");
			throw new NegativeNumberException();
		}
		if (area != null && area.length() >= 4 && area.length() <= 30) {
			System.out.println("Valid Railway Station Area");
			validArea=true;
		}else {
			System.out.println("Invalid Railway Station Area");
			throw new InvalidNameException();
		}
		if(ticket > 0) {
			System.out.println("Valid Ticket price ");
			validTicket=true;
		}else {
			System.out.println("InValid Ticket price");
			throw new NegativeNumberException();
		}
		
		if(validName && validNoOfPlatforms && validArea && validTicket) {
			System.out.println("All The Data Is Correct ,So Save To Repository");
			boolean saved=this.railwayStationRepo.create(dto);
			System.out.println("Saved:"+saved);
			return saved;
		}

			return false;
	}

}
