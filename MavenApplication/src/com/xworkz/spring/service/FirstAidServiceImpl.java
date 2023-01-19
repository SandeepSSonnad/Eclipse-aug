package com.xworkz.spring.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.FirstAidDTO;
import com.xworkz.spring.repository.FirstAidRepo;

@Component
public class FirstAidServiceImpl implements FirstAidService{
	
	private FirstAidRepo firstAidRepo;
	
	@Autowired
	private Validator validator;
	

	public FirstAidServiceImpl(FirstAidRepo firstAidRepo) {
		this.firstAidRepo=firstAidRepo;
		System.out.println("Creating service by passing repo...from spring");
	}
	
	
	@Override
	public boolean ValidateAndSave(FirstAidDTO dto) {
		System.out.println("Executing Validate And Save in FirstAidServiceImpl");
		System.out.println("DTO Saved :"+dto);
		
		
		Set<ConstraintViolation<FirstAidDTO>> violations=this.validator.validate(dto);
		
		if(!violations.isEmpty()) {
			System.err.println("There is Violation Errors occured");
			violations.forEach(cs->System.err.println(cs.getMessage()));
			return false;
		}else {
			System.out.println("Data is Valid and Ready to Save");
			boolean saved=this.firstAidRepo.Save(dto);
			return saved;
		}
		
	}

}
