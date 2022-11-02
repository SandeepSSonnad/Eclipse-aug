package com.xworkz.encapsulation.officeWork;

import com.xworkz.encapsulation.office.Bag;

public class CollegeBagRunner {

	public static void main(String[] args) {

		Bag bag=new Bag();
		System.out.println("Brand:"+bag.getBrand());
		System.out.println("ManufactureYear:"+bag.getManufactureYear());
		System.out.println("ExpiryYear:"+bag.getExpiryYear());
		System.out.println("Colour:"+bag.getColour());
		System.out.println("Size:"+bag.getSize());
		System.out.println("Type:"+bag.getType());
		System.out.println("Quantity:"+bag.getQuantity());
		System.out.println("SafetyForChildren:"+bag.getForChildren());
		System.out.println("Price:"+bag.getPrice());
		System.out.println("Hard Disc:"+bag.getCompartment());
		System.out.println("Processor:"+bag.getProcessor());
		System.out.println("RAM:"+bag.getWarrenty());
		System.out.println("GraphicCard:"+bag.getGraphicCard());

	}

}
