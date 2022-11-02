package com.xworkz.encapsulation.charg;

import com.xworkz.encapsulation.charger.Phone;

public class PhoneRunner {

	public static void main(String[] args) {

		Phone phone=new Phone();
		System.out.println("Brand:"+phone.getBrand());
		System.out.println("ManufactureYear:"+phone.getManufactureYear());
		System.out.println("ExpiryYear:"+phone.getExpiryYear());
		System.out.println("Colour:"+phone.getColour());
		System.out.println("Size:"+phone.getSize());
		System.out.println("Type:"+phone.getType());
		System.out.println("Quantity:"+phone.getQuantity());
		System.out.println("SafetyForChildren:"+phone.getSafetyForChildren());
		System.out.println("Price:"+phone.getPrice());
		System.out.println("Hard Disc:"+phone.getHardDisc());
		System.out.println("Processor:"+phone.getProcessor());
		System.out.println("RAM:"+phone.getRam());
		System.out.println("GraphicCard:"+phone.getGraphicCard());


	

	}

}
