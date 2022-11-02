package com.xworkz.encapsulation.boot;

public class KiranaStore {
	
	public static void main(String[] args) {
	
	Groceries groceries=new Groceries();
	groceries.setStoreName("Dmart");
	groceries.setCompany("Walmart");
	groceries.setOwnerName("R K Damani");
	groceries.setShareValue(3800);
	groceries.setGoodBalanceSheet(true);
	groceries.setSales("Incresing");
	groceries.setProfit(2000000000);
	groceries.setDebt("Decresing");
	groceries.setType("GroceryStore");
	groceries.setNoOfStores(5000);
	groceries.setYearReturn(35.0);
	groceries.setCompetitor("Jio Mart");
	groceries.setRightToInvest(true);
	groceries.setInvestingPlatform("Zerodha");
	
	System.out.println("Store Name:"+groceries.getStoreName());
	System.out.println("Company:"+groceries.getCompany());
	System.out.println("Owner Name:"+groceries.getOwnerName());
	System.out.println("Share Price:"+groceries.getShareValue());
	System.out.println("Good Balance Sheet:"+groceries.getGoodBalanceSheet());
	System.out.println("Sales:"+groceries.getSales());
	System.out.println("Net Profit:"+groceries.getProfit());
	System.out.println("Total Debt:"+groceries.getDebt());
	System.out.println("Type of Company:"+groceries.getType());
	System.out.println("No of Store:"+groceries.getNoOfStores());
	System.out.println("Year of Return:"+groceries.getYearReturn());
	System.out.println("Competitor:"+groceries.getCompetitor());
	System.out.println("Right to Invest:"+groceries.getRightToInvest());
	System.out.println("Platform:"+groceries.getInvestingPlatform());

}
}

