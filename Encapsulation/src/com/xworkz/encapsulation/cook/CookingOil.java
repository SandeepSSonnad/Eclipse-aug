package com.xworkz.encapsulation.cook;


public class CookingOil {

	public static void main(String[] args) {


		Oil oil=new Oil();
		oil.setBrand("RuchiGold");
		oil.setManufactureYear(2022);
		oil.setExpiryYear(2022);
		oil.setColour("Colourless");
		oil.setSize('M');
		oil.setSalt("No ");
		oil.setType("Cooking oil");
		oil.setQuantity(100);
		oil.setSafetyForChildren(false);
		oil.setPrice(180);
		oil.setFlavour("SunFlower");
		oil.setSolvent("Not Soluble in Wate");
		oil.setChemical("No");
		
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
