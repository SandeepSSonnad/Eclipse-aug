package com.xworkz.service;

import com.xworkz.DTO.HelmetDTO;
import com.xworkz.constant.Colour;
import com.xworkz.constant.Type;
import com.xworkz.repository.HelmetRepository;

public class HelmetServiceImpl implements HelmetService {

	private HelmetRepository helmetRepo;

	public HelmetServiceImpl(HelmetRepository helmetRepo) {
		this.helmetRepo = helmetRepo;
	}

	@Override
	public boolean validateAndSave(HelmetDTO dto) {
		System.out.println("Running Valid and Save");
		String brand=dto.getBrand();
		Double price=dto.getPrice();
		Colour colour=dto.getColour();
		Type type=dto.getType();
		boolean validBrand=true;
		boolean validPrice=true;
		boolean validColour=true;
		boolean validType=true;
		if(brand != null && brand.length()>=3 && brand.length()<=10) {
			System.out.println("Valid Brand Name");
		}else {
			System.out.println("Invalid Brand Name");
		}
		if(price != null && price >= 100 && price <=10000) {
			System.out.println("Valid Price");
		}else {
			System.out.println("Invalid Price");
		}
		if(colour != null) {
			System.out.println("Valid Colour");
		}else {
			System.out.println("Invalid Colour");
		}
		if(type != null) {
			System.out.println("Valid Type");
		}else {
			System.out.println("Invalid Type");
		}
		if(validBrand && validPrice && validColour && validType) {
			System.out.println("HelemtDTO is Valid , can Save Using Repository");
			boolean saved=this.helmetRepo.save(dto);
			System.out.println("HelmetDTO is Saved:"+saved);
			return saved;
		}
		return false;
	}

}
