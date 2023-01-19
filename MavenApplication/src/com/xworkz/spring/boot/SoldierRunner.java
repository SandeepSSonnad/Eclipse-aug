package com.xworkz.spring.boot;

import com.xworkz.spring.dto.SoldierDTO;
import com.xworkz.spring.repository.SoldierRepo;
import com.xworkz.spring.repository.SoldierRepoImpl;
import com.xworkz.spring.service.SoldierServiceImpl;

public class SoldierRunner {

	public static void main(String[] args) {
		
		SoldierDTO dtos=new SoldierDTO("Satish", 143, "Betalian", "Topper", "Indian");
		
		SoldierServiceImpl service=new SoldierServiceImpl();
		SoldierRepo repo=new SoldierRepoImpl();
		
        service.setSoldierRepo(repo);	
		service.validateAndSave(dtos);
		
		
		

	}

}
