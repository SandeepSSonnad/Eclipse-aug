package com.xworkz.spring.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.spring.dto.SoldierDTO;
import com.xworkz.spring.repository.SoldierRepo;

public class SoldierServiceImpl implements SoldierService {

	private SoldierRepo soldierRepo;

	public SoldierServiceImpl() {
		System.out.println("Runnning SoldierServiceImpl Constructor....");
	}

	public void setSoldierRepo(SoldierRepo soldierRepo) {
		this.soldierRepo=soldierRepo;
	}
	

	@Override
	public boolean validateAndSave(SoldierDTO dto) {
		System.out.println("Executing the Validate and save");
		System.out.println("DTO Saved: " + dto);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violations = validator.validate(dto);
		if (!violations.isEmpty()) {
			System.out.println("Validation Errors are Occured");
			violations.forEach(ele->System.err.println("Violation Message :"+ele.getMessage()));
			return false;
		}else {
			System.out.println("Data is Valid");
			boolean saved=soldierRepo.save(dto);
			System.out.println("DTO Saved using repo :"+saved);
			return saved;
		}

	}

}
