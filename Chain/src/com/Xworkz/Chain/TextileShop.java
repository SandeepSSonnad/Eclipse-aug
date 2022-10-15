package com.Xworkz.Chain;

public class TextileShop {
 
	public String OwnerName;
	public String OwnerWifeName;
	public String OwnerDaughterName;
	public long OwnerDaughterNumber; 
	public int OwnersNoofWifes;
	public int ShopNo;
	public long ContactNo;
	
	public TextileShop(String OwnerName) {
		this.OwnerName=OwnerName;
		System.out.println("Printing Details");
	}
	
	public TextileShop(String OwnerName, String OwnerWifeName) {
		this(OwnerName);
		this.OwnerWifeName=OwnerWifeName;
	}
	
	public TextileShop(String OwnerName, String OwnerWifeName, String OwnerDaughterName) {
		this(OwnerName,OwnerWifeName);
		this.OwnerDaughterName=OwnerDaughterName;
	}
	
	public TextileShop(String OwnerName, String OwnerWifeName, String OwnerDaughterName, long OwnerDaughterNumber) {
		this(OwnerName,OwnerWifeName,OwnerDaughterName);
		this.OwnerDaughterNumber=OwnerDaughterNumber;
	}
	
	public TextileShop(String OwnerName, String OwnerWifeName, String OwnerDaughterName, long OwnerDaughterNumber,int OwnersNoofWifes) {
		this(OwnerName,OwnerWifeName,OwnerDaughterName,OwnerDaughterNumber);
		this.OwnersNoofWifes=OwnersNoofWifes;
	}
	
	public TextileShop(String OwnerName, String OwnerWifeName, String OwnerDaughterName, long OwnerDaughterNumber,int OwnersNoofWifes,int ShopNo) {
		this(OwnerName,OwnerWifeName,OwnerDaughterName,OwnerDaughterNumber,OwnersNoofWifes);
		this.ShopNo=ShopNo;
	}
	
	public TextileShop(String OwnerName, String OwnerWifeName, String OwnerDaughterName, long OwnerDaughterNumber,int OwnersNoofWifes,int ShopNo,long ContactNo) {
		this(OwnerName,OwnerWifeName,OwnerDaughterName,OwnerDaughterNumber,OwnersNoofWifes,ShopNo);
		this.ContactNo=ContactNo;
	}
	
	public TextileShop(String OwnerName, String OwnerWifeName, int OwnersNoofWife) {
		this(OwnerName,OwnerWifeName);
		this.OwnersNoofWifes=OwnersNoofWife;
		
	}
	
	
	
}
