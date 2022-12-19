package com.xworkz.runner;

import com.xworkz.DTO.TheaterDTO;
import com.xworkz.exception.InvalidNameException;
import com.xworkz.exception.NegativeNumberException;
import com.xworkz.repository.TheaterRepository;
import com.xworkz.repository.TheaterRepositoryImpl;
import com.xworkz.service.TheaterService;
import com.xworkz.service.TheaterServiceImpl;

public class TheaterRunner {

	public static void main(String[] args) {
		
		TheaterRepository repo=new TheaterRepositoryImpl();
		TheaterService serve=new TheaterServiceImpl(repo);
		TheaterDTO dto= new TheaterDTO("Sandeep", "Sandeep", 2341,"Akash Cinamas", "Non-PVR", 200);
		try {
			serve.validateAndSave(dto);
		}catch(NegativeNumberException e){
			System.out.println("Handle The Negative Number Exception");
			e.getMessage();
		}catch(InvalidNameException ets) {
			System.out.println("Handle The Invalid Name Exception");
			ets.getMessage();
		}
	}

}
