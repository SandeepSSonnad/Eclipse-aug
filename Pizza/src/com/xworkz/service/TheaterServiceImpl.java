package com.xworkz.service;

import com.xworkz.DTO.TheaterDTO;
import com.xworkz.exception.InvalidNameException;
import com.xworkz.exception.NegativeNumberException;
import com.xworkz.repository.TheaterRepository;

public class TheaterServiceImpl implements TheaterService {

	TheaterRepository theaterRepository;

	public TheaterServiceImpl(TheaterRepository theaterRepository) {
		System.out.println("Running Theater Service ");
		this.theaterRepository = theaterRepository;
	}

	@Override
	public boolean validateAndSave(TheaterDTO dto) throws NegativeNumberException, InvalidNameException {
		System.out.println("Running Validate And Save Method:" + dto);
		int id = dto.getId();
		String name = dto.getName();
		String brand = dto.getBrand();
		int seats = dto.getSeats();
		boolean validId = false;
		boolean validName = false;
		boolean validBrand = false;
		boolean validSeats = false;

		if (id >= 0) {
			System.out.println("Valid TheaterId Number");
			validId = true;
		} else {
			System.out.println("Invalid TheaterId Number");
			throw new NegativeNumberException();
		}
		if (name != null && name.length() >= 3 && name.length() <= 20) {
			System.out.println("Valid Theater Name");
			validName = true;
		} else {
			System.out.println("Invalid Theater Name");
			throw new InvalidNameException();
		}
		if (brand != null && brand.length() >= 3 && brand.length() <= 20) {
			System.out.println("Valid Brand Name");
			validBrand = true;
		} else {
			System.out.println("Invalid Brand Name");
			throw new InvalidNameException();
		}
		if (seats >= 0) {
			System.out.println("Valid Seats Number");
			validSeats = true;
		} else {
			System.out.println("Invalid Seats Number");
			throw new NegativeNumberException();
		}
		if (validId && validName && validBrand && validSeats) {
			System.out.println("All The Date Is Valid And Ready For Save");
			boolean saved = this.theaterRepository.store(dto);
			System.out.println("Saved:" + saved);
			return saved;
		}

		return false;
	}

}
