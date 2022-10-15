package com.Xworkz.Runner;

import com.Xworkz.Chain.Tractor;

public class TractorRunner {

	public static void main(String[] args) {

		Tractor tractor = new Tractor("John Deer");
		System.out.println(tractor.Name);
		
		Tractor tractor1= new Tractor("John Deer", 800000);
		System.out.println(tractor1.Name);
		System.out.println(tractor1.Price);
		
		Tractor tractor2=new Tractor("John Deer", 800000,"JohnDeer");
		System.out.println(tractor2.Name);
		System.out.println(tractor2.Price);
		System.out.println(tractor2.Brand);
		
		Tractor tractor3=new Tractor("John Deer", 800000,"JohnDeer",15);
		System.out.println(tractor3.Name);
		System.out.println(tractor3.Price);
		System.out.println(tractor3.Brand);
		System.out.println(tractor3.Hp);

		Tractor tractor4=new Tractor("John Deer", 800000,"JohnDeer",15,"Green");
		System.out.println(tractor4.Name);
		System.out.println(tractor4.Price);
		System.out.println(tractor4.Brand);
		System.out.println(tractor4.Hp);
		System.out.println(tractor4.Colour);
		
		Tractor tractor5=new Tractor("John Deer", 800000,"JohnDeer",15,"Green","New 1174");
		System.out.println(tractor5.Name);
		System.out.println(tractor5.Price);
		System.out.println(tractor5.Brand);
		System.out.println(tractor5.Hp);
		System.out.println(tractor5.Colour);
		System.out.println(tractor5.Model);
		
		
		
		
		
	}

}
