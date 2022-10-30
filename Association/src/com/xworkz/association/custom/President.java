package com.xworkz.association.custom;

import com.xworkz.association.keyword.Gender;

public class President {

	public String name;
	public int tenure = 5;
	public Gender gender;

	public President(String name, Gender gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	
	public void showOff() {
		System.out.println(this.name);
		System.out.println(tenure);
		if(gender!=null) {
			System.out.println(this.gender);
		}
	}

}
