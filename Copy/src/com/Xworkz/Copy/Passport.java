package com.Xworkz.Copy;

public class Passport {

	public int Number;//319956231
	public String Name;//Sandeep
	public int ExpiryDate;//2025
	public String Country;//India
	public int IssueDate;//2022
	public int NoOfLeafes;//25
	
	public Passport(int Number) {
		this.Number = Number;
	}
	
	public Passport(String Name) {
		this.Name = Name;
	}

	public Passport(int Number, String Name) {
		this.Number = Number;
		this.Name = Name;
	}

	public Passport(String Name, String Country, int ExpiryDate) {
		this.Name = Name;
		this.Country = Country;
		this.ExpiryDate = ExpiryDate;
	}

	public Passport(String Name, String Country, int ExpiryDate, int IssueDate) {
		this.Name = Name;
		this.Country = Country;
		this.ExpiryDate = ExpiryDate;
		this.IssueDate= IssueDate;
	}

	public Passport(int Number, int ExpiryDate, int IssueDate,int NoOfLeaves) {
		this.Number = Number;
		this.ExpiryDate = ExpiryDate;
		this.IssueDate= IssueDate;
		this.NoOfLeafes=NoOfLeaves;
	}
	public Passport(int Number, int ExpirtDate,String Name, String Country) {
		this.Number=Number;
		this.ExpiryDate=ExpirtDate;
        this.Name=Name;
        this.Country=Country;
	}
	
	public Passport(int Number, int ExpirtDate,int Issuedate, String Country) {
		this.Number=Number;
		this.ExpiryDate=ExpirtDate;
        this.IssueDate=Issuedate;
        this.Country=Country;
	}
	
	
}
