package com.Xworkz.copy.Bus;

public class DeveloperRunner {

	public static void main(String[] args) {
		
		Developer developer1=new Developer();
		System.out.println("Printing The Default Values");
		System.out.println(developer1.Name);
		System.out.println(developer1.Education);
		System.out.println(developer1.Experince);
		System.out.println(developer1.Salary);
		System.out.println(developer1.Company);
		
		developer1.Name="Sandeep";
		developer1.Education="Bachelor Of Engineering";
		developer1.Experince=0;
		developer1.Salary=40000;
		developer1.Company="X-workz";
		
		System.out.println("Printing All Instance values");
		System.out.println(developer1.Name);
		System.out.println(developer1.Education);
		System.out.println(developer1.Experince);
		System.out.println(developer1.Salary);
		System.out.println(developer1.Company);

	}

}
