package com.Xworkz.Copy;

public class FishRunner {

	public static void main(String[] args) {

		Fish fish = new Fish("Swimmer");
		System.out.println(fish.Name);

		Fish fish1 = new Fish(200);
		System.out.println(fish1.Price);

		Fish fish2 = new Fish(121.0);
		System.out.println(fish2.Weight);
		
		Fish fish3= new Fish("Swimmer", 200);
		System.out.println(fish3.Name);
		System.out.println(fish3.Price);
		
		Fish fish4=new Fish("Bony Fish", 121.0);
		System.out.println(fish4.Type);
		System.out.println(fish4.Weight);
		
		Fish fish5=new Fish("Swimmer", "Bony Fish");
		System.out.println(fish5.Name);
		System.out.println(fish5.Type);
		
		Fish fish6=new Fish(200, 121);
		System.out.println(fish6.Price);
		System.out.println(fish6.Weight);
		
		Fish fish7= new Fish("Swimmer", 200, 121);
		System.out.println(fish7.Name);
		System.out.println(fish7.Price);
		System.out.println(fish7.Weight);
		

	}

}
