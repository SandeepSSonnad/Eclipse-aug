package com.xworkz.encapsulation.brush;

public class Paste {

	public static void main(String[] args) {
		
		ToothPaste toothPaste=new ToothPaste();
		toothPaste.setBrand("Colgate");
		toothPaste.setManufactureYear(2022);
		toothPaste.setExpiryYear(2023);
		toothPaste.setColour("White");
		toothPaste.setSize('M');
		toothPaste.setSalt("White Salt");
		toothPaste.setType("Neam");
		toothPaste.setQuantity(100);
		toothPaste.setSafetyForChildren(false);
		toothPaste.setPrice(180);
		toothPaste.setFlavour("Strawberry");
		toothPaste.setSolvent("Soluble in Wate");
		toothPaste.setChemical("Fluoride");
		
		System.out.println("Brand :"+toothPaste.getBrand());
		System.out.println("ManufactureYear :"+toothPaste.getManufactureYear());
		System.out.println("ExpiryYear :"+toothPaste.getExpiryYear());
		System.out.println("Colour :"+toothPaste.getColour());
		System.out.println("Size :"+toothPaste.getSize());
		System.out.println("Salt :"+toothPaste.getSalt());
		System.out.println("Type :"+toothPaste.getType());
		System.out.println("Quantity :"+toothPaste.getQuantity());
		System.out.println("SafetyForChildren :"+toothPaste.getSafetyForChildren());
		System.out.println("Price :"+toothPaste.getPrice());
		System.out.println("Flavour :"+toothPaste.getFlavour());
		System.out.println("Solvent :"+toothPaste.getSolvent());
		System.out.println("Chemical :"+toothPaste.getChemical());
		
		
		
		
		
  }
}
