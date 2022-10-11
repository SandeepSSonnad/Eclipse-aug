package com.Xworkz.copy.Bus;
import com.Xworkz.copy.Bus.*;
public class DistrictCollectorRunner {

	public static void main(String[] args) {
		
		DistrictCollector Details= new DistrictCollector();
		System.out.println("Printing Default Values");
		System.out.println(Details.Name);
		System.out.println(Details.Age);
		System.out.println(Details.District);
		System.out.println(Details.BatchNo);
		
		System.out.println("Intilization ");
		Details.Name="D K Ravi";
		Details.Age=35;
		Details.District="Kolar";
		Details.BatchNo=2011;
		
		System.out.println(Details.Name);
		System.out.println(Details.Age);
		System.out.println(Details.District);
		System.out.println(Details.BatchNo);
		
	}

}
