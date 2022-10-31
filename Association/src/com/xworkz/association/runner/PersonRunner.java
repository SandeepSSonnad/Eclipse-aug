package com.xworkz.association.runner;

import com.xworkz.association.custom.Email;
import com.xworkz.association.things.Person;

public class PersonRunner {

	public static void main(String[] args) {
		
		Person person =new Person("Sandeep");
		
		Email email1=new Email("Sandeep@email.com","Sandeep@123",9741426746L);
		Email email2=new Email("Chetan@email.com","Chetan@123",9741426746L);
		
		Email[] emails= {email1,email2};
		
		person.setEmail(emails);
		
		person.showOff();
	}
}
