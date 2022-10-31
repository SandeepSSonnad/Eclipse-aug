package com.xworkz.association.custom;


public class Job {
	
	public int salary;
	public String role;
	public boolean bond;
	public CompanyNew companyNew=new CompanyNew("X-workz","Omkar");
	public Email email=new Email("Sandeep@email.com","Sandeep@123",9741426746L);
	
	public Job(int salary, String role, boolean bond) {
		super();
		this.salary = salary;
		this.role = role;
		this.bond = bond;
	}
	
	public void showOff() {
		System.out.println(this.salary);
		System.out.println(this.role);
		System.out.println(this.bond);
		companyNew.showOff();
		email.showOff();
	}
	
	

}
