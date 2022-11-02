package com.xworkz.encapsulation.charger;

public class Phone {
	
	String brand="Oppo";
	int manufactureYear=2022;
	int expiryYear=2023;
	String colour="White";
	char size='S';
	String type= "Normal";
	int quantity=1;
	boolean safetyForChildren=false;
	int price=25000;
	String processor="Octa Core";
	int ram=4;
	int hardDisc=64;
	String graphicCard="No";

	void setBrand(String brand) {
		this.brand = brand;
	}

	void setManufactureYear(int manufactureYear) {
		this.manufactureYear = manufactureYear;
	}

	void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}

	void setColour(String colour) {
		this.colour = colour;
	}

	void setSize(char size) {
		this.size = size;
	}

	void setType(String type) {
		this.type = type;
	}

	void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	void setSafetyForChildren(boolean safetyForChildren) {
		this.safetyForChildren = safetyForChildren;
	}

	void setPrice(int price) {
		this.price = price;
	}

	void setProcessor(String processor) {
		this.processor = processor;
	}

	void setRam(int ram) {
		this.ram = ram;
	}
	
	void setGraphicCard(String graphicCard) {
		this.graphicCard=graphicCard;
	}

	void setHardDisc(int hardDisc) {
		this.hardDisc = hardDisc;
	}

	public String getBrand() {
		return brand;
	}

	public int getManufactureYear() {
		return manufactureYear;
	}

	public int getExpiryYear() {
		return expiryYear;
	}

	public String getColour() {
		return colour;
	}

	public char getSize() {
		return size;
	}

	public String getType() {
		return type;
	}

	public int getQuantity() {
		return quantity;
	}

	public boolean getSafetyForChildren() {
		return safetyForChildren;
	}

	public int getPrice() {
		return price;
	}

	public String getGraphicCard() {
		return graphicCard;
	}

	public String getProcessor() {
		return processor;
	}
	
	public int getHardDisc() {
		return hardDisc;
	}

	public int  getRam() {
		return ram;
	}


}
