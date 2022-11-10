package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.custom.PrashanthNeel;
import com.xworkz.inheritance.thing.Director;

public class DirectorRunner {

	public static void main(String[] args) {

		Director director=new PrashanthNeel("Manages The Company", "Film Industry", "Kannada Film Industry");
		PrashanthNeel neel=(PrashanthNeel)director;
		neel.display();
		
	}

}
