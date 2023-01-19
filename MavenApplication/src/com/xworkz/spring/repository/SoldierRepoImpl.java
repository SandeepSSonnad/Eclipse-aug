package com.xworkz.spring.repository;

import com.xworkz.spring.dto.SoldierDTO;

public class SoldierRepoImpl implements SoldierRepo {
	
	public SoldierRepoImpl() {
		System.out.println("Creating SoldierRepoImpl using No-args Constructor..");
	}

	@Override
	public boolean save(SoldierDTO dto) {
		System.out.println("Running Save");
		System.out.println("SoldierDTO is Saved :"+dto);
		return true;
	}

}
