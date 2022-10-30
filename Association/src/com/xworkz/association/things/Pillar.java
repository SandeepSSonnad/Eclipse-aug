package com.xworkz.association.things;

import com.xworkz.association.custom.Company;
import com.xworkz.association.keyword.Shape;

public class Pillar {
	
	public int id;
	public String place;
	public Shape shape;
	public double height;
	public String supporting;
	public Company company=new Company("Xworkz","Software Trainee");
	
	public Pillar() {
		
	}
	
	public void Pilly(int id,String place,Shape shape,double height,String supporting) {
		this.id=id;
		this.place=place;
		this.shape=shape;
		this.height=height;
		this.supporting=supporting;
	}
	
	public void ShowOff() {
		System.out.println(this.id);
		System.out.println(this.place);
		System.out.println(this.shape);
		System.out.println(this.height);
		System.out.println(this.supporting);
	    company.ShowOff();
	}
	
	
	


}
