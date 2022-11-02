package com.xworkz.encapsulation.charger;



public class Mobile {

	public static void main(String[] args) {
		
		Phone phone=new Phone();
		phone.setBrand("Vivo");
		phone.setManufactureYear(2022);
		phone.setExpiryYear(2030);
		phone.setColour("Black");
		phone.setSize('M');
		phone.setType("Mini");
		phone.setQuantity(2);
		phone.setSafetyForChildren(false);
		phone.setPrice(15000);
		phone.setHardDisc(64);
		phone.setProcessor("Octa Core");
		phone.setRam(4);
		phone.setGraphicCard("N0");
		
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
