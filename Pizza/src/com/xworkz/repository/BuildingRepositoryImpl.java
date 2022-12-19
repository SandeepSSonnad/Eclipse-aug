package com.xworkz.repository;

import com.xworkz.DTO.BuildingDTO;
import com.xworkz.exception.StorageFullException;

public class BuildingRepositoryImpl implements BuildingRepository {

	BuildingDTO[] dtos=new BuildingDTO[2];
	int pos=0;
	
	@Override
	public boolean save(BuildingDTO dto) {
		System.out.println("Running Save method :"+dto);
		if(this.pos >= this.dtos.length) {
			System.out.println("Exception Is Created So Give Correct ArraySize");
			throw new StorageFullException();
		}
		
		this.dtos[this.pos]=dto;
		System.out.println("Saved:"+dto+"In Position:"+pos);
		pos++;
		return true;
	}

}
