package com.xworkz.encapsulation.cloth;


public class Pant {

	public static void main(String[] args) {
		
		Shirt shirt=new Shirt();
		shirt.setBrand("Trends");
		shirt.setManufactureYear(2022);
		shirt.setExpiry("Not Mention");
		shirt.setColour("Blue");
		shirt.setSize('M');
		shirt.setType("Jeans ");
		shirt.setQuantity(1);
		shirt.setForChildren(false);
		shirt.setPrice(80);
		shirt.setDiscount(12);
		shirt.setComport("Yes");
		shirt.setWarrenty("No");
		shirt.setRatings(3);

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
