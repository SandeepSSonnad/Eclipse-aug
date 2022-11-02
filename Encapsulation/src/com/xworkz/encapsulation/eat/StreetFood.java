package com.xworkz.encapsulation.eat;

public class StreetFood {

	public static void main(String[] args) {

		Food food = new Food();
		food.setBrand("Noodles");
		food.setManufactureYear(2022);
		food.setExpiryYear(2022);
		food.setColour("White");
		food.setSize('M');
		food.setSalt("Yes ");
		food.setType("Fast Food");
		food.setQuantity(100);
		food.setSafetyForChildren(false);
		food.setPrice(80);
		food.setFlavour("Normal");
		food.setChemical("Yes");

		System.out.println("Brand :" + food.getBrand());
		System.out.println("ManufactureYear :" + food.getManufactureYear());
		System.out.println("ExpiryYear :" + food.getExpiryYear());
		System.out.println("Colour :" + food.getColour());
		System.out.println("Size :" + food.getSize());
		System.out.println("Salt :" + food.getSalt());
		System.out.println("Type :" + food.getType());
		System.out.println("Quantity :" + food.getQuantity());
		System.out.println("SafetyForChildren :" + food.getSafetyForChildren());
		System.out.println("Price :" + food.getPrice());
		System.out.println("Flavour :" + food.getFlavour());
		System.out.println("Chemical :" + food.getChemical());
		
	}

}
