package com.Xworkz.Copy;

public class PassportRunner {

	public static void main(String[] args) {
		
      Passport passport=new Passport("Sandeep");
      System.out.println(passport.Name);
      
      Passport passport1=new Passport(319956231);
      System.out.println(passport1.Number);
      
      Passport passport2= new Passport(319956231, "Sandeep");
      System.out.println(passport2.Number);
      System.out.println(passport2.Name);
      
      Passport passport3=new Passport("Sandeep", "India",2025 );
      System.out.println(passport3.Name);
      System.out.println(passport3.Country);
      System.out.println(passport3.ExpiryDate);
      
      Passport passport4=new Passport("Sandeep", "India",2025,2022 );
      System.out.println(passport4.Name);
      System.out.println(passport4.Country);
      System.out.println(passport4.ExpiryDate);
      System.out.println(passport4.IssueDate);
      
      Passport passport5=new Passport(319956231,2025,2022,25 );
      System.out.println(passport5.Number);
      System.out.println(passport5.ExpiryDate);
      System.out.println(passport5.IssueDate);
      System.out.println(passport5.NoOfLeafes);
      
      Passport passport6=new Passport(319956231,2025,"Sandeep","India" );
      System.out.println(passport6.Number);
      System.out.println(passport6.ExpiryDate);
      System.out.println(passport6.Name);
      System.out.println(passport6.Country);
      
      Passport passport7=new Passport(319956231,2025,2022,"India" );
      System.out.println(passport7.Number);
      System.out.println(passport7.ExpiryDate);
      System.out.println(passport7.IssueDate);
      System.out.println(passport7.Country);
      
      
      
      
      
	}

}
