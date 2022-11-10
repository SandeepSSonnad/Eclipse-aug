package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.custom.Bjp;
import com.xworkz.inheritance.thing.PoliticalParty;

public class PoliticalPartyRunner {

	public static void main(String[] args) {

		PoliticalParty party=new Bjp("Bharatiya Janata Party",1980,"J P Nadda");
		Bjp bjp=(Bjp)party;
		bjp.display();
		
		
		
		
	}

}
