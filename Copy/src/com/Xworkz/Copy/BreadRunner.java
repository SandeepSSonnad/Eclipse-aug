package com.Xworkz.Copy;

public class BreadRunner {

	public static void main(String[] args) {
		
		Bread bread=new Bread("CORNBREAD");
		System.out.println(bread.Type);
		
		Bread bread1=new Bread("Reactangle","Britannia Bread");
		System.out.println(bread1.Shape);
		System.out.println(bread1.CompanyName);
		
		Bread bread2=new Bread("CORNBREAD","Britannia Bread","Reactangle");
		System.out.println(bread2.Shape);
		System.out.println(bread2.CompanyName);
		System.out.println(bread2.Type);

		Bread bread3=new Bread("CORNBREAD","Britannia Bread","Reactangle","One Pound");
		System.out.println(bread3.Shape);
		System.out.println(bread3.CompanyName);
		System.out.println(bread3.Type);
		System.out.println(bread3.Quantity);
		
		Bread bread4=new Bread(40);
		System.out.println(bread4.Price);
		
		Bread bread5=new Bread(40, "CORNBREAD");
		System.out.println(bread5.Price);
		System.out.println(bread5.Type);
		
		Bread bread6=new Bread("CORNBREAD",40,"One Pound");
		System.out.println(bread6.Price);
		System.out.println(bread6.Type);
		System.out.println(bread6.Quantity);
		
		Bread bread7=new Bread("CORNBREAD",40,"Britannia Bread","Rectangle");
		System.out.println(bread7.Price);
		System.out.println(bread7.Type);
		System.out.println(bread7.CompanyName);
		System.out.println(bread7.Shape);
		
				
		
		
		

	}

}
