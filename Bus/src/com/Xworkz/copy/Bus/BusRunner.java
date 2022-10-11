package com.Xworkz.copy.Bus;
import com.Xworkz.copy.Bus.*;
public class BusRunner {

	public static void main(String[] args) {
		
		Bus Details= new Bus();
		System.out.println("Default values printing");
		System.out.println(Details.Num);
		System.out.println(Details.Starting);
		System.out.println(Details.Destination);
		
		Details.Num=944;
		Details.Starting="Laggere";
		Details.Destination="RajajiNagar";
		
		System.out.println("Intilizing All The Instance Value");
		System.out.println(Details.Num);
		System.out.println(Details.Starting);
		System.out.println(Details.Destination);

	}

}
