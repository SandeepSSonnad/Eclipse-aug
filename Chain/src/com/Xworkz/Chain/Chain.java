package com.Xworkz.Chain;

public class Chain {
	
	public String Type;
	public int Price;
	public int Length;
	public String Material;
	public double Weight;
	public boolean Stolen;
	public String UsedFor;
	public boolean Fresh;
	
	public Chain(String Type) {
		this.Type=Type;
		System.out.println("Printing Only Type");
	}
	
	public Chain(String Type, int Price) {
		this(Type);
		this.Price=Price;
		System.out.println("Printing Both Type and Price");
	}
	
    public Chain(String Type, int Price,int Length) {
    	this(Type,Price);
    	this.Length=Length;
    	System.out.println("Printing Both Type and Price and Length");
    }
    
    public Chain(String Type, int Price,int Length , String Material) {
    	this(Type,Price,Length);
    	this.Material=Material;
    	System.out.println("Printing Both Type , Price , Length, Material");
    }
    
    public Chain(String Type, int Price,int Length, String Material,double Weight) {
    	this(Type,Price,Length,Material);
    	this.Weight=Weight;
    	System.out.println("Printing Both Type , Price , Length, Material, Weight");
    }
    
    public Chain(String Type, int Price,int Length, String Material,double Weight,boolean Stolen) {
    	this(Type,Price,Length,Material,Weight);
    	this.Stolen=Stolen;
    	System.out.println("Printing Both Type , Price , Length, Material, Weight,Stolen");
    }
    
    public Chain(String Type, int Price,int Length, String Material,double Weight,boolean Stolen, String UsedFor) {
    	this(Type,Price,Length,Material,Weight,Stolen);
    	this.UsedFor=UsedFor;
    	System.out.println("Printing Both Type , Price , Length, Material, Weight, Stolen, UsedFor");
    }
    
    public Chain(String Type, int Price,int Length, String Material,double Weight,boolean Stolen, String UsedFor, boolean Fresh) {
    	this(Type,Price,Length,Material,Weight,Stolen,UsedFor);
    	this.Fresh=Fresh;
    	System.out.println("Printing Both Type , Price , Length, Material, Weight, Stolen, UsedFor, Fresh");
    }
    

}
