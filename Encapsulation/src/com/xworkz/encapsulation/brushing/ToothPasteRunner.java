package com.xworkz.encapsulation.brushing;

import com.xworkz.encapsulation.brush.ToothPaste;

public class ToothPasteRunner {

	public static void main(String[] args) {
		
		ToothPaste toothPaste=new ToothPaste();
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
