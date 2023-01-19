package com.xworkz.spring.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.MissileDTO;
import com.xworkz.spring.repository.MissileRepo;

@Component
public class MissileServiceImpl implements MissileService {
	
	@Autowired
	private Validator validator;
	
	private MissileRepo missileRepo;

	public MissileServiceImpl(MissileRepo missileRepo) {
		this.missileRepo=missileRepo;
		System.out.println("Creating MissileServiceImpl const..");
	}

	@Override
	public boolean validateAndSave(MissileDTO dto) {
		System.out.println("Executing validate and save");
		System.out.println("Saved Dto "+dto);
		
		Set<ConstraintViolation<MissileDTO>> violations=this.validator.validate(dto);
		
		if(!violations.isEmpty()){
			System.out.println("There is Violation Error occured");
			violations.forEach(cv->System.out.println(cv.getMessage()));
			return false;
		}else {
			System.out.println("Data is Valid And ready to Save");
			boolean saved=this.missileRepo.save(dto);
			return saved;
		}
		
		
	}

}
