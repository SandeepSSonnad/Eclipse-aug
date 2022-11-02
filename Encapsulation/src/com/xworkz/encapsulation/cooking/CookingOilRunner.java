package com.xworkz.encapsulation.cooking;

import com.xworkz.encapsulation.cook.Oil;

public class CookingOilRunner {

	public static void main(String[] args) {

		Oil oil = new Oil();
		System.out.println("Brand :"+oil.getBrand());
		System.out.println("ManufactureYear :"+oil.getManufactureYear());
		System.out.println("ExpiryYear :"+oil.getExpiryYear());
		System.out.println("Colour :"+oil.getColour());
		System.out.println("Size :"+oil.getSize());
		System.out.println("Salt :"+oil.getSalt());
		System.out.println("Type :"+oil.getType());
		System.out.println("Quantity :"+oil.getQuantity());
		System.out.println("SafetyForChildren :"+oil.getSafetyForChildren());
		System.out.println("Price :"+oil.getPrice());
		System.out.println("Flavour :"+oil.getFlavour());
		System.out.println("Solvent :"+oil.getSolvent());
		System.out.println("Chemical :"+oil.getChemical());
	}

}
