package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.custom.Venkateshwara;
import com.xworkz.inheritance.thing.PetrolBunk;

public class PetrolBunkRunner {

	public static void main(String[] args) {

		
		PetrolBunk bunk=new Venkateshwara("Nayara","Mahalakshmi Layout", "Petrol");
		Venkateshwara venkateshwara=(Venkateshwara)bunk;
		venkateshwara.display();
		venkateshwara.details();
		
		
		
		
		
		
	}

}
