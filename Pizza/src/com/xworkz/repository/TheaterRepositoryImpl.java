package com.xworkz.repository;

import com.xworkz.DTO.TheaterDTO;
import com.xworkz.exception.StorageFullException;

public class TheaterRepositoryImpl implements TheaterRepository{

	TheaterDTO[] dtos=new TheaterDTO[2];
	int position=0;
	
	@Override
	public boolean store(TheaterDTO dto) {
		System.out.println("Running Theater Store:"+dto);
		if(this.position >= this.dtos.length) {
			System.out.println("Created Exception SO Please Check the Size of Array");
			throw new StorageFullException();
		}
		
		this.dtos[this.position]=dto;
		System.out.println("Saved:"+dto+"In Position"+position);
		position++;
		return true;
	}

}
