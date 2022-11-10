package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.custom.Akshara;
import com.xworkz.inheritance.thing.Hr;

public class HrRunner {

	public static void main(String[] args) {

		Hr hr=new Akshara("Akshara",50000,"Xworkz","Not Sure");
		Akshara akshara=(Akshara)hr;
		akshara.display();
		akshara.seeDetails();
		
	}

}
