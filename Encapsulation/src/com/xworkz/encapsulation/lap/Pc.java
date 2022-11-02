package com.xworkz.encapsulation.lap;

public class Pc {

	public static void main(String[] args) {
		
		PersonalComputer computer=new PersonalComputer();
		computer.setBrand("HP");
		computer.setManufactureYear(2022);
		computer.setExpiryYear(2030);
		computer.setColour("Black");
		computer.setSize('M');
		computer.setType("Mini");
		computer.setQuantity(2);
		computer.setSafetyForChildren(false);
		computer.setPrice(55000);
		computer.setHardDisc(512);
		computer.setProcessor("Ryzen");
		computer.setRam(8);
		computer.setGraphicCard("AMDA Radeon");
		
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
