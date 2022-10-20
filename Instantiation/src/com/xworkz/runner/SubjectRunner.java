package com.xworkz.runner;

import com.xworkz.thing.Subject;

public class SubjectRunner {

	public static void main(String[] args) {
		
		
		String[] items1 = {"Maths","Physics","Computer Science","History"};
		String[] items2 = {"Matrices","Gravity","Programming"};
		String[] items3 = {"Aryabhat","C.V.Raman","Charles Babej","Mourya Empire"};
		double[] items4 = {34000.0,150000.0,2000000.0};
		long[]   items5 = {13458,794543,1455354};
		String[] items6 = {"India","Russia","USA"};
		
		Subject pass = new Subject("JAVA","Code","USA",1,true,items1,items2,items3,items4,items5,items6);
		
		pass.display();

	}

}
