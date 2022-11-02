package com.xworkz.encapsulation.laptop;

import com.xworkz.encapsulation.lap.PersonalComputer;

public class PersonalComputerRunner {

	public static void main(String[] args) {
		
		PersonalComputer computer=new PersonalComputer();
		System.out.println("Brand:"+computer.getBrand());
		System.out.println("ManufactureYear:"+computer.getManufactureYear());
		System.out.println("ExpiryYear:"+computer.getExpiryYear());
		System.out.println("Colour:"+computer.getColour());
		System.out.println("Size:"+computer.getSize());
		System.out.println("Type:"+computer.getType());
		System.out.println("Quantity:"+computer.getQuantity());
		System.out.println("SafetyForChildren:"+computer.getSafetyForChildren());
		System.out.println("Price:"+computer.getPrice());
		System.out.println("Hard Disc:"+computer.getHardDisc());
		System.out.println("Processor:"+computer.getProcessor());
		System.out.println("RAM:"+computer.getRam());
		System.out.println("GraphicCard:"+computer.getGraphicCard());

	}

}
