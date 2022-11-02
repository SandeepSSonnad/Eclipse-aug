package com.xworkz.encapsulation.eat;

public class Food {
	
	String brand="Maggi";
	int manufactureYear=2022;
	int expiryYear=2022;
	String colour="Yellow";
	char size='M';
	String salt="Yes";
	String type= "Edible";
	int quantity=250;
	boolean safetyForChildren=false;
	int price=30;
	String flavour="Red Chilli Masala";
	String chemical= "Yes";

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

	void setSalt(String salt) {
		this.salt = salt;
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

	void setFlavour(String flavour) {
		this.flavour = flavour;
	}


	void setChemical(String chemical) {
		this.chemical = chemical;
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

	public String getSalt() {
		return salt;
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

	public String getFlavour() {
		return flavour;
	}


	public String getChemical() {
		return chemical;
	}


}
