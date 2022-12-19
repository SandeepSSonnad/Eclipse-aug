package com.xworkz.repository;

import com.xworkz.DTO.RailwayStationDTO;
import com.xworkz.exception.StorageFullException;

public class RailwayStationRepoImpl implements RailwayStationRepo {

	RailwayStationDTO[] dtos = new RailwayStationDTO[2];
	int index = 0;

	@Override
	public boolean create(RailwayStationDTO rdt) {
		System.out.println("Running Create Of Railway Station:"+rdt);
		if(this.index >= this.dtos.length) {
			System.out.println("Creating Exception So Please Check Once");
			throw new StorageFullException();
		}
		
		this.dtos[this.index]=rdt;
		System.out.println("Created:"+rdt+"In the index"+index);
		index++;
		return true;
	}

}
