package com.Xworkz.Runner;

import com.Xworkz.Chain.Chain;

public class ChainRunner {

	public static void main(String[] args) {
		
		Chain chain=new Chain("Gold Chain");
		System.out.println(chain.Type);
		
		Chain chain1=new Chain("Gold Chain",100000);
		System.out.println(chain1.Type);
		System.out.println(chain1.Price);
		
		Chain chain2=new Chain("Gold Chain",100000,14);
		System.out.println(chain2.Type);
		System.out.println(chain2.Price);
		System.out.println("Length Of Chain In Inch="+chain2.Length);
		
		Chain chain3=new Chain("Gold Chain",100000,14,"24 Carrot Gold");
		System.out.println(chain3.Type);
		System.out.println(chain3.Price);
		System.out.println("Length Of Chain In Inch="+chain3.Length);
		System.out.println(chain3.Material);
		
		Chain chain4=new Chain("Gold Chain",100000,14,"24 Carrot Gold",20);
		System.out.println(chain4.Type);
		System.out.println(chain4.Price);
		System.out.println("Length Of Chain In Inch="+chain4.Length);
		System.out.println(chain4.Material);
		System.out.println("Weight in Grams="+chain4.Weight);
		
		Chain chain5=new Chain("Gold Chain",100000,14,"24 Carrot Gold",20, false);
		System.out.println(chain5.Type);
		System.out.println(chain5.Price);
		System.out.println("Length Of Chain In Inch="+chain5.Length);
		System.out.println(chain5.Material);
		System.out.println("Weight in Grams="+chain5.Weight);
		System.out.println("Stolen="+chain5.Stolen);
		
		Chain chain6=new Chain("Gold Chain",100000,14,"24 Carrot Gold",20, false,"Marriage");
		System.out.println(chain6.Type);
		System.out.println(chain6.Price);
		System.out.println("Length Of Chain In Inch="+chain6.Length);
		System.out.println(chain6.Material);
		System.out.println("Weight in Grams="+chain6.Weight);
		System.out.println("Stolen="+chain6.Stolen);
		System.out.println(chain6.UsedFor);
		
		Chain chain7=new Chain("Gold Chain",100000,14,"24 Carrot Gold",20, false,"Marriage",true);
		System.out.println(chain7.Type);
		System.out.println(chain7.Price);
		System.out.println("Length Of Chain In Inch="+chain7.Length);
		System.out.println(chain7.Material);
		System.out.println("Weight in Grams="+chain7.Weight);
		System.out.println("Stolen="+chain7.Stolen);
		System.out.println(chain7.UsedFor);
		System.out.println(chain7.Fresh);
		
		
		
		
		
		
	}

}
