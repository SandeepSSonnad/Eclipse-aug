package com.xworkz.association.things;

import com.xworkz.association.custom.Email;
import com.xworkz.association.custom.Job;

public class Person {
	
	public String name;
	public Email[]  emails;
	public Job job=new Job(35000,"Software developer",false);
	
	public Person(String name) {
		super();
		this.name = name;
	}
	
	public void setEmail(Email[]  emails) {
		this.emails=emails;
	}
	 
	public void showOff() {
		System.out.println(this.name);
		System.out.println(this.emails);
		job.showOff();
	}
	
	

}
