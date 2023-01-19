package com.xworkz.spring.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.ResortDTO;

@Component
public class ResortRepoImpl implements ResortRepo {

	public ResortRepoImpl() {
		System.out.println("Creating ResortRepoImpl constr....");
	}
	
	
	@Override
	public boolean save(ResortDTO rdto) {
		System.out.println("Running Save in repo");
		System.out.println("Saved with repo :"+rdto);
		return true;
	}

}
