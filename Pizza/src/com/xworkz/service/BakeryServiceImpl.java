package com.xworkz.service;

import com.xworkz.DTO.BakeryDTO;
import com.xworkz.exception.InvalidNameException;
import com.xworkz.repository.BakeryRepository;

public class BakeryServiceImpl implements BakeryService {

	BakeryRepository bakeryRepository;

	public BakeryServiceImpl(BakeryRepository bakeryRepository) {
		System.out.println("Running Bakery ServiceImpl const");
		this.bakeryRepository = bakeryRepository;
	}

	@Override
	public boolean validateAndSave(BakeryDTO dto) throws InvalidNameException {
		System.out.println("Running Validate and Save:" + dto);
		String name = dto.getName();
		String owner = dto.getOwner();
		long contactNo = dto.getContact();
		String location = dto.getLocation();
		String famousFor = dto.getFamousFor();
		boolean validName = true;
		boolean validOwner = true;
		boolean validContactNo = true;
		boolean validLocation = true;
		boolean validFamousFor = true;
		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("Valid Bakery Name");
			validName = true;
		} else {
			System.out.println("Invalid Bakery Name");
			throw new InvalidNameException();
		}
		if (owner != null && owner.length() >= 4 && owner.length() <= 20) {
			System.out.println("Valid Owner Name");
			validOwner = true;
		} else {
			System.out.println("Invalid Owner Name");
			throw new InvalidNameException();
		}
		if(contactNo >= 10 ) {
			System.out.println("Valid Contact Number");
			validContactNo=true;
		}else {
			System.out.println("Invalid Contact Number");
			throw new InvalidNameException();
		}
		
		if (location != null && location.length() >= 4 && location.length() <= 20) {
			System.out.println("Valid Location Name");
			validLocation = true;
		} else {
			System.out.println("Invalid Location Name");
			throw new InvalidNameException();
		}
		if (famousFor != null && famousFor.length() >= 4 && famousFor.length() <= 20) {
			System.out.println("Valid FamousFor Name");
			validFamousFor = true;
		} else {
			System.out.println("Invalid FamousFor Name");
			throw new InvalidNameException();
		}
		if (validName && validOwner && validContactNo && validLocation && validFamousFor ) {
			System.out.println("All the Parameters is Valid And Ready To Save in Repository");
			boolean saved = this.bakeryRepository.save(dto);
			System.out.println("Bakery Repository:"+saved);
			return saved;
		}

		return false;
	}

}
