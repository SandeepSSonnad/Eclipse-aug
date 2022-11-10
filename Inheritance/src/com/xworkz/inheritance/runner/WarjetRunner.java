package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.custom.Rafale;
import com.xworkz.inheritance.thing.Warjet;

public class WarjetRunner {

	public static void main(String[] args) {

		Warjet warjet=new Rafale("War","India", "TATA");
		Rafale rafale=(Rafale)warjet;
		rafale.display();
		rafale.details();
		
	}

}
