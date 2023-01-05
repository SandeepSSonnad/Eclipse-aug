package com.xworkz.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.xworkz.constant.WeaponType;

public class WeaponDTO implements Serializable,Comparable<WeaponDTO>{
	
	private String name;
	private String madeBy;
	private LocalDate madeOn;
	private Integer price;
	private WeaponType type;
	
	public WeaponDTO() {
		System.out.println("Default Constructor Running.........");
	}

	public WeaponDTO(String name, String madeBy, LocalDate madeOn, int price, WeaponType type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price + ", type="
				+ type + "]";
	}
	
	@Override
	public int hashCode() {
		System.out.println("Running hashCode........");
		return 24;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null) {
			if(obj instanceof WeaponDTO) {
				WeaponDTO wdto=(WeaponDTO)obj;
				if(wdto.getName().equals(this.name))
					return true;
				
			}
		}
		return false;
	}

	@Override
	public int compareTo(WeaponDTO o) {
		
		return this.name.compareTo(o.name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public LocalDate getMadeOn() {
		return madeOn;
	}

	public void setMadeOn(LocalDate madeOn) {
		this.madeOn = madeOn;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public WeaponType getType() {
		return type;
	}

	public void setType(WeaponType type) {
		this.type = type;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
