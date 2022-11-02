package com.xworkz.encapsulation.acquire;

public class Analysis {
	
	String storeName="Anu TeaShop";
	String ownerName="Anu ";
	int shareValue=100;
	boolean goodBalanceSheet=true;
	String sales="Increasing";
	int profit=10000;
	String debt="No";
	String type="";
	int noOfStores=10;
	double yearReturn=25.0;
	String competitor="StarBucks";
	boolean rightToInvest=true;
	String investingPlatfrom="Zerodha";

	void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	void setShareValue(int shareValue) {
		this.shareValue = shareValue;
	}

	void setGoodBalanceSheet(boolean goodBalanceSheet) {
		this.goodBalanceSheet = goodBalanceSheet;
	}

	void setSales(String sales) {
		this.sales = sales;
	}

	void setProfit(int profit) {
		this.profit = profit;
	}

	void setDebt(String debt) {
		this.debt = debt;
	}

	void setType(String type) {
		this.type = type;
	}

	void setNoOfStores(int noOfStores) {
		this.noOfStores = noOfStores;
	}

	void setYearReturn(double yearReturn) {
		this.yearReturn = yearReturn;
	}

	void setCompetitor(String competitor) {
		this.competitor = competitor;
	}

	void setRightToInvest(boolean rightToInvest) {
		this.rightToInvest = rightToInvest;
	}

	void setInvestingPlatform(String investingPlatfrom) {
		this.investingPlatfrom = investingPlatfrom;
	}

	public String getStoreName() {
		return storeName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public int getShareValue() {
		return shareValue;
	}

	public boolean getGoodBalanceSheet() {
		return goodBalanceSheet;
	}

	public String getSales() {
		return sales;
	}

	public int getProfit() {
		return profit;
	}

	public String getDebt() {
		return debt;
	}

	public String getType() {
		return type;
	}

	public int getNoOfStores() {
		return noOfStores;
	}

	public double getYearReturn() {
		return yearReturn;
	}

	public String getCompetitor() {
		return competitor;
	}

	public boolean getRightToInvest() {
		return rightToInvest;
	}

	public String getInvestingPlatform() {
		return investingPlatfrom;
	}


}
