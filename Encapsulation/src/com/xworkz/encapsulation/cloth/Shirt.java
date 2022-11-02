package com.xworkz.encapsulation.cloth;

public class Shirt {
	
	String brand="Raymond";
	int manufactureYear=2022;
	String expiry="Until it Cut ";
	String colour="Blue";
	char size='S';
	String type= "Formal";
	int quantity=1;
	boolean ForChildren=false;
	int price=2999;
	int discount=10;
	String comport="Yes";
	String warrenty="No";
	int ratings=4;

	void setBrand(String brand) {
		this.brand = brand;
	}

	void setManufactureYear(int manufactureYear) {
		this.manufactureYear = manufactureYear;
	}

	void setExpiry(String expiry) {
		this.expiry = expiry;
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

	void setForChildren(boolean ForChildren) {
		this.ForChildren = ForChildren;
	}

	void setPrice(int price) {
		this.price = price;
	}

	void setDiscount(int discount) {
		this.discount = discount;
	}

	void setRatings(int ratings) {
		this.ratings = ratings;
	}
	
	void setComport(String comport) {
		this.comport=comport;
	}

	void setWarrenty(String warrenty) {
		this.warrenty = warrenty;
	}

	public String getBrand() {
		return brand;
	}

	public int getManufactureYear() {
		return manufactureYear;
	}

	public String getExpiry() {
		return expiry;
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

	public boolean getForChildren() {
		return ForChildren;
	}

	public int getPrice() {
		return price;
	}

	public int getDiscount() {
		return discount;
	}

	public String getcomport() {
		return comport;
	}
	
	public int getRatings() {
		return ratings;
	}

	public String  getWarrenty() {
		return warrenty;
	}


}
