package com.xworkz.encapsulation.office;


public class CollegeBag {

	public static void main(String[] args) {

		Bag bag=new Bag();
		bag.setBrand("WildCraft");
		bag.setManufactureYear(2022);
		bag.setExpiryYear(2030);
		bag.setColour("Black");
		bag.setSize('M');
		bag.setType("LaptopBag");
		bag.setQuantity(2);
		bag.setForChildren(false);
		bag.setPrice(1000);
		bag.setCompartment(2);
		bag.setProcessor("No");
		bag.setWarrenty(1);
		bag.setGraphicCard("N0");
		
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
