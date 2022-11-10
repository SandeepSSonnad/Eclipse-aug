package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.custom.NamingCeremonyInvitation;
import com.xworkz.inheritance.thing.Invitation;

public class InvitationRunner {

	public static void main(String[] args) {

		Invitation invitation=new NamingCeremonyInvitation("Naming Ceremony Card",10000,"Chandana Printers");
		NamingCeremonyInvitation ncm=(NamingCeremonyInvitation)invitation;
		ncm.display();
		
		
		
		
	}

}
