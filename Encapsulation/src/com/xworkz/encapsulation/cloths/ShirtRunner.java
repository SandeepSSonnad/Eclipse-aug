package com.xworkz.encapsulation.cloths;

import com.xworkz.encapsulation.cloth.Shirt;

public class ShirtRunner {

	public static void main(String[] args) {

		Shirt shirt=new Shirt();
		System.out.println("Brand :" + shirt.getBrand());
		System.out.println("ManufactureYear :" + shirt.getManufactureYear());
		System.out.println("ExpiryYear :" + shirt.getExpiry());
		System.out.println("Colour :" + shirt.getColour());
		System.out.println("Size :" + shirt.getSize());
		System.out.println("Type :" + shirt.getType());
		System.out.println("Quantity :" + shirt.getQuantity());
		System.out.println("SafetyForChildren :" + shirt.getForChildren());
		System.out.println("Price :" + shirt.getPrice());
		System.out.println("Flavour :" + shirt.getDiscount());
		System.out.println("Chemical :" + shirt.getcomport());
		System.out.println("Warrenty:"+shirt.getWarrenty());
		System.out.println("Ratings:"+shirt.getRatings());
		
		
	
	}

}
