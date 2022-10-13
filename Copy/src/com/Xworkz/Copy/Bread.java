package com.Xworkz.Copy;

public class Bread {

	public String Type;// CORNBREAD
	public String Shape;// Rectangle
	public String CompanyName;// Britannia Bread.
	public int Price;// 40
	public String Quantity;// one pound

	public Bread(String Type) {
		this.Type = Type;
	}

	public Bread(String Shape, String CompanyName) {
		this.Shape = Shape;
		this.CompanyName = CompanyName;
	}

	public Bread(String Type, String CompanyName, String Shape) {
		this.Type = Type;
		this.CompanyName = CompanyName;
		this.Shape = Shape;
	}

	public Bread(String Type, String CompanyName, String Shape, String Quantity) {
		this.Type = Type;
		this.CompanyName = CompanyName;
		this.Shape = Shape;
		this.Quantity = Quantity;
	}

	public Bread(int Price) {
		this.Price = Price;
	}

	public Bread(int Price, String Type) {
		this.Price = Price;
		this.Type = Type;
	}

	public Bread(String Type, int Price, String Quantity) {
		this.Price = Price;
		this.Type = Type;
		this.Quantity = Quantity;
	}

	public Bread(String Type, int Price, String CompanyName, String Shape) {
		this.Type = Type;
		this.CompanyName = CompanyName;
		this.Shape = Shape;
		this.Price = Price;
	}
}
