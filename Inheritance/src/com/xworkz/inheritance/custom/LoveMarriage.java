package com.xworkz.inheritance.custom;

import com.xworkz.inheritance.thing.Marriage;

public class LoveMarriage extends Marriage {

	public LoveMarriage(String name, int cost, String location) {
		super(name, cost, location);

	}

	public void Love() {
		System.out.println(this.name);
		System.out.println(this.cost);
		System.out.println(this.location);

	}

}
