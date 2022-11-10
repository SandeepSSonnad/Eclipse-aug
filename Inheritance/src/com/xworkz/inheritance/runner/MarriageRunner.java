package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.custom.LoveMarriage;
import com.xworkz.inheritance.thing.Marriage;

public class MarriageRunner {

	public static void main(String[] args) {

		Marriage marriage=new LoveMarriage("Omkar",1000000,"Bangalore");
		LoveMarriage loveMarriage=(LoveMarriage)marriage;
		loveMarriage.Love();
		
	}

}
