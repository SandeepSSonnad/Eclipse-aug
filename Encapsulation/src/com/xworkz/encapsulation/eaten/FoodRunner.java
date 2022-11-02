package com.xworkz.encapsulation.eaten;

import com.xworkz.encapsulation.eat.Food;

public class FoodRunner {

	public static void main(String[] args) {


		Food food=new Food();
		System.out.println("Brand :"+food.getBrand());
		System.out.println("ManufactureYear :"+food.getManufactureYear());
		System.out.println("ExpiryYear :"+food.getExpiryYear());
		System.out.println("Colour :"+food.getColour());
		System.out.println("Size :"+food.getSize());
		System.out.println("Salt :"+food.getSalt());
		System.out.println("Type :"+food.getType());
		System.out.println("Quantity :"+food.getQuantity());
		System.out.println("SafetyForChildren :"+food.getSafetyForChildren());
		System.out.println("Price :"+food.getPrice());
		System.out.println("Flavour :"+food.getFlavour());
		System.out.println("Chemical :"+food.getChemical());
	

	}

}
