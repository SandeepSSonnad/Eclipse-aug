package com.xworkz.association.custom;

public class Email {

	public String id;
	public String password;
	public long mobileNumber;
	public EmailCompany emailcompany=new EmailCompany("Google","Paul Buchheit");
	
	public Email(String id, String password, long mobileNumber) {
		super();
		this.id = id;
		this.password = password;
		this.mobileNumber = mobileNumber;
	}
	
	public void showOff() {
		System.out.println(this.id);
		System.out.println(this.password);
		System.out.println(this.mobileNumber);
		emailcompany.showOff();
	}
	
	
	
}
