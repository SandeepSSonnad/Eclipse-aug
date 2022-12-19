package com.xworkz.repository;

import com.xworkz.DTO.PlaceDTO;
import com.xworkz.exception.StorageFullException;

public class PlaceRepositoryImpl implements PlaceRepository {

	PlaceDTO[] dtos=new PlaceDTO[2];
	int index=0;
	
	@Override
	public boolean store(PlaceDTO dto) {
		System.out.println("Running Store:"+dto);
		if(this.index >= this.dtos.length) {
			System.out.println("Exception is Created, Give Correct ArraySize");
			throw new StorageFullException();
		}
		
		this.dtos[this.index]=dto;
		System.out.println("Saved:"+dto+"In index"+index);
		index++;
		return true;
	}

}
