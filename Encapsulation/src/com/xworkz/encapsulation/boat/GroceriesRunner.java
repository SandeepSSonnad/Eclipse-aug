package com.xworkz.encapsulation.boat;

import com.xworkz.encapsulation.boot.Groceries;

public class GroceriesRunner {

	public static void main(String[] args) {
		
		Groceries groceries= new Groceries();
		
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
