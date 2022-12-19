package com.xworkz.repository;

import com.xworkz.DTO.HelmetDTO;

public class HelmetRepositoryImpl implements HelmetRepository {

	HelmetDTO[] dto2 = new HelmetDTO[2];
	int index=0;
		
	
	@Override
	public boolean save(HelmetDTO dtot) {
		System.out.println("Running Save Method");
		if(this.index>=this.dto2.length) {
			System.out.println("Running Exception");
			throw new ArrayIndexOutOfBoundsException();
		}
		
		this.dto2[this.index]=dtot;
		System.out.println("Saved:"+dtot+"In Index:"+index);
		index++;
		
		return true;
	}

}
