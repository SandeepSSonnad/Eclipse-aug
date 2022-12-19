package com.xworkz.service;

import com.xworkz.DTO.PlaceDTO;
import com.xworkz.exception.InvalidNameException;
import com.xworkz.repository.PlaceRepository;

public class PlaceServiceImpl implements PlaceService {

	PlaceRepository placeRepository;

	public PlaceServiceImpl(PlaceRepository placeRepository) {
		this.placeRepository = placeRepository;
		System.out.println("Running Service Constructor");
	}

	@Override
	public boolean validateAndSave(PlaceDTO dto) throws InvalidNameException {
		System.out.println("Running validateAndSave:" + dto);
		String name = dto.getName();
		String famousFor = dto.getFamousFor();
		String district = dto.getDistrict();
		String state = dto.getState();
		String country = dto.getCountry();
		boolean validName = false;
		boolean validFamousFor = false;
		boolean validDistrict = false;
		boolean validState = false;
		boolean validCountry = false;

		if (name != null && name.length() >= 3 && name.length() <= 20) {
			System.out.println(name+":Valid Place Name");
			validName = true;
		} else {
			System.out.println("Invalid Place Name");
			throw new InvalidNameException();
		}
		if (famousFor != null && famousFor.length() >= 3 && famousFor.length() <= 30) {
			System.out.println("Place Is Famous For:" + famousFor);
			validFamousFor = true;
		} else {
			System.out.println("Place Is Not Famous For:" + famousFor);
			throw new InvalidNameException();
		}
		if (district != null && district.length() >= 3 && district.length() <= 20) {
			System.out.println(district+":Valid District Name");
			validDistrict = true;
		} else {
			System.out.println("Invalid District Name");
			throw new InvalidNameException();
		}
		if (state != null && state.length() >= 3 && state.length() <= 20) {
			System.out.println(state+":Valid State Name");
			validState = true;
		} else {
			System.out.println("Invalid State Name");
			throw new InvalidNameException();
		}
		if (country != null && country.length() >= 3 && country.length() <= 20 && country.charAt(0) >= 65
				&& country.charAt(0) <= 90) {
			System.out.println(country+":Valid Country Name");
			validCountry = true;
		} else {
			System.out.println("Invalid Country Name");
			throw new InvalidNameException();
		}

		if (validName && validFamousFor && validDistrict && validState && validCountry) {
			System.out.println("All The Data Is Correct And Ready To Save");
			boolean saved = this.placeRepository.store(dto);
			System.out.println("Saved:" + saved);
			return saved;
		}

		return false;
	}

}
