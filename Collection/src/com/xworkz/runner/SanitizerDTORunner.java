package com.xworkz.runner;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SanitizerDTORunner {

	public static void main(String[] args) {

		SanitizerDTO dto1 = new SanitizerDTO(1234, "Sterillium", 224, "Blue");
		SanitizerDTO dto2 = new SanitizerDTO(3112, "LifeBoy", 187, "White");
		SanitizerDTO dto3 = new SanitizerDTO(2134, "Himalaya", 250, "Orange");
		SanitizerDTO dto4 = new SanitizerDTO(7685, "Solimo", 225, "Transparent");
		SanitizerDTO dto5 = new SanitizerDTO(8690, "Savlon", 47, "Blue");
		SanitizerDTO dto6 = new SanitizerDTO(4523, "Dettol", 193, "Pink");
		SanitizerDTO dto7 = new SanitizerDTO(5674, "Boroplus", 89, "Voilet");
		SanitizerDTO dto8 = new SanitizerDTO(6453, "Palmolive", 250, "Green");
		SanitizerDTO dto9 = new SanitizerDTO(9923, "SterloMax", 199, "Red");
		SanitizerDTO dto10 = new SanitizerDTO(1087, "Triguard", 105, "Blue");

		Collection<SanitizerDTO> dtos = new LinkedHashSet<SanitizerDTO>();
		dtos.add(dto10);
		dtos.add(dto9);
		dtos.add(dto8);
		dtos.add(dto7);
		dtos.add(dto6);
		dtos.add(dto5);
		dtos.add(dto4);
		dtos.add(dto3);
		dtos.add(dto2);
		dtos.add(dto1);

		Iterator<SanitizerDTO> ref = dtos.iterator();
		while (ref.hasNext()) {
			SanitizerDTO sdto = ref.next();
			if (sdto.getPrice() >= 250) {
				System.out.println("Price is Greater than 5 :" + sdto);
			}

		}

		System.out.println("=====================================");

		Iterator<SanitizerDTO> ref1 = dtos.iterator();
		while (ref1.hasNext()) {
			SanitizerDTO sdto = ref1.next();
			if (sdto.getBrand() == null && sdto.getColour() == null) {
				System.out.println("Null properties are : " + sdto);
			} else {
				System.out.println("There Is No Null Properties");
			}

		}

		System.out.println("==================================");

		Iterator<SanitizerDTO> ref3 = dtos.iterator();
		while (ref3.hasNext()) {
			SanitizerDTO sdto = ref3.next();
			if(sdto.getPrice() >= 250) {
				System.out.println(sdto);
				
			}
			
		}
		System.out.println("===========================================");
		
		for (SanitizerDTO sanitizer : dtos) {
			if (sanitizer.getPrice() <= 100) {
				System.out.println(sanitizer);
			}
		}
		System.out.println("======================================");
		System.out.println("Before Removing : " + dtos.size());

		Iterator<SanitizerDTO> ref2 = dtos.iterator();
		while (ref2.hasNext()) {
			SanitizerDTO sdto = ref2.next();

			if (sdto.getColour() == "Blue" || sdto.getColour() == "Green" || sdto.getColour() == "Red") {
				ref2.remove();

			}

		}
		System.out.println("After Removing : " + dtos.size());
		System.out.println("==========================================");

	}

}
