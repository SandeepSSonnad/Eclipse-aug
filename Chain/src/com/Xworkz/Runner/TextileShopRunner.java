package com.Xworkz.Runner;

import com.Xworkz.Chain.TextileShop;

public class TextileShopRunner {

	public static void main(String[] args) {
		
		TextileShop textileShop=new TextileShop("Raghavendra");
		System.out.println(textileShop.OwnerName);

		TextileShop textileShop1=new TextileShop("Raghavendra", "Ramya");
		System.out.println(textileShop1.OwnerName);
		System.out.println(textileShop1.OwnerWifeName);
		
		TextileShop textileShop2=new TextileShop("Raghavendra", "Ramya", "Vanitha");
		System.out.println(textileShop2.OwnerName);
		System.out.println(textileShop2.OwnerWifeName);
		System.out.println(textileShop2.OwnerDaughterName);
		
		TextileShop textileShop3=new TextileShop("Raghavendra", "Ramya", "Vanitha", 9723435637L);
		System.out.println(textileShop3.OwnerName);
		System.out.println(textileShop3.OwnerWifeName);
		System.out.println(textileShop3.OwnerDaughterName);
		System.out.println(textileShop3.OwnerDaughterNumber);
		
		TextileShop textileShop4=new TextileShop("Raghavendra", "Ramya", "Vanitha", 9723435637L,3);
		System.out.println(textileShop4.OwnerName);
		System.out.println(textileShop4.OwnerWifeName);
		System.out.println(textileShop4.OwnerDaughterName);
		System.out.println(textileShop4.OwnerDaughterNumber);
		System.out.println(textileShop4.OwnersNoofWifes);
		
		TextileShop textileShop5=new TextileShop("Raghavendra", "Ramya", "Vanitha", 9723435637L ,3 ,45);
		System.out.println(textileShop5.OwnerName);
		System.out.println(textileShop5.OwnerWifeName);
		System.out.println(textileShop5.OwnerDaughterName);
		System.out.println(textileShop5.OwnerDaughterNumber);
		System.out.println(textileShop5.OwnersNoofWifes);
		System.out.println(textileShop5.ShopNo);
		
		TextileShop textileShop6=new TextileShop("Raghavendra", "Ramya", "Vanitha", 9723435637L ,3 ,45,6362456312L);
		System.out.println(textileShop6.OwnerName);
		System.out.println(textileShop6.OwnerWifeName);
		System.out.println(textileShop6.OwnerDaughterName);
		System.out.println(textileShop6.OwnerDaughterNumber);
		System.out.println(textileShop6.OwnersNoofWifes);
		System.out.println(textileShop6.ShopNo);
		System.out.println(textileShop6.ContactNo);
		
		TextileShop textileShop7=new TextileShop("Raghavendra", "Ramya", 3);
		System.out.println(textileShop7.OwnerName);
		System.out.println(textileShop7.OwnerWifeName);
		System.out.println(textileShop7.OwnersNoofWifes);
		
	
	}

}
