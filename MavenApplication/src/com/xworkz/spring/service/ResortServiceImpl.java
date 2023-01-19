package com.xworkz.spring.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.ResortDTO;
import com.xworkz.spring.repository.ResortRepo;

@Component
public class ResortServiceImpl implements ResortService {

	@Autowired
	private Validator validator;
	private ResortRepo repo;

	public ResortServiceImpl(ResortRepo repo) {
		this.repo=repo;
		System.out.println("Creating ResortServiceImpl constr.....");
	}

	@Override
	public boolean validateAndSave(ResortDTO dto) {
		System.out.println("Executing validate and save");
		System.out.println("Saved dto :" + dto);

		Set<ConstraintViolation<ResortDTO>> violations = this.validator.validate(dto);

		if (!violations.isEmpty()) {
			System.out.println("There is Error occured");
			violations.forEach(ele -> System.out.println(ele.getMessage()));
			return false;
		} else {
			System.out.println("Data is Valid And Ready to Save");
			boolean saved = this.repo.save(dto);
			return saved;
		}

	}

}
