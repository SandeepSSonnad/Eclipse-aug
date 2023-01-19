package com.xworkz.spring.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.spring.dto.TerroristDTO;

public class TerroristServiceimpl implements TerroristService{
	
	public TerroristServiceimpl() {
		System.out.println("Created TerroristServiceimpl using no-args Constructor");
	}

	@Override
	public boolean validateAndSave(TerroristDTO dto) {
		System.out.println("executing validateAndSave start");
		System.out.println("Dto passed :"+dto);
		
	ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		Set<ConstraintViolation<TerroristDTO>> violations=
				validator.validate(dto);
		if(!violations.isEmpty()) {
			System.out.println("Error is there");
			violations.forEach(c->System.err.println(c.getMessage()));
			return false;
		}
		
		System.out.println("No Validation errors");
		return true;
	}

}
