package com.xworkz.repository;

import com.xworkz.DTO.BakeryDTO;
import com.xworkz.exception.StorageFullException;

public class BakeryRepoImpl implements BakeryRepository {

	BakeryDTO[] dtos = new BakeryDTO[2];
	int index = 0;

	@Override
	public boolean save(BakeryDTO dto) {
		System.out.println("Running Save Method");
		if (this.index >= this.dtos.length) {
			System.out.println("Running StorageFull Exception, So Please check " + "the size of the Array");
			throw new StorageFullException();
		}

		this.dtos[this.index] = dto;
		System.out.println("Saved:" + dto + "In the Index:" + index);
		index++;
		return true;
	}

}
