package com.xworkz.association.things;

import com.xworkz.association.custom.Brand;
import com.xworkz.association.keyword.Type;

public class Fuel {
	
	public Brand brand=new Brand("Bharat Petrol","LZLPS9712GZ12",5);
	public boolean special;
	public Type type;
	public int price;
	public double quantity;
	
	public Fuel(boolean special, Type type, int price, double quantity) {
		super();
		this.special = special;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
		
		if(brand!=null) {
			System.out.println("Execution of brand is start");
		}
		else {
			System.out.println("It is null point");
		}
	}
	
	public void ShowOff() {
		System.out.println(this.special);
		System.out.println(this.price);
		System.out.println(this.quantity);
		System.out.println(this.type);
		brand.ShowOff();
	}
	
	

}
