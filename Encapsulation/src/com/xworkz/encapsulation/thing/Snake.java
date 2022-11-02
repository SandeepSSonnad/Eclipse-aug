package com.xworkz.encapsulation.thing;

public class Snake {

	String type= "Cobra";
	int lifeSpan= 20;
	boolean venom=true;
	int reptileFamilies= 19;
	int snakeSpecies=2900;
	boolean quiet=false;
	boolean active=true;
	boolean legs=false;
	int lengthInFeet= 13;
	double weightInPounds=20;
	String favoriteFood="Mongoose";
	String homeTown="Northern India";
	boolean blind=false;

	public String getType() {
		return this.type;
	}

	public int getLifeSpan() {
		return this.lifeSpan;
	}

	public boolean getVenom() {
		return this.venom;
	}

	public int getReptileFamilies() {
		return this.reptileFamilies;
	}

	public int getSnakeSpecies() {
		return this.snakeSpecies;
	}

	public boolean getQuiet() {
		return this.quiet;
	}

	public boolean getActive() {
		return this.active;
	}

	public boolean getLegs() {
		return this.legs;
	}

	public int getLengthInFeet() {
		return this.lengthInFeet;
	}

	public double getWeightInPounds() {
		return this.weightInPounds;
	}

	public String getFavoriteFood() {
		return this.favoriteFood;
	}

	public String getHomeTown() {
		return this.homeTown;
	}

	public boolean getBlind() {
		return this.blind;
	}

	void setType(String type) {
		this.type = type;
	}

	void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	void setVenom(boolean venom) {
		this.venom = venom;
	}

	void setReptileFamilies(int reptileFamilies) {
		this.reptileFamilies = reptileFamilies;
	}

	void setSnakeSpecies(int snakeSpecies) {
		this.snakeSpecies = snakeSpecies;
	}

	void setQuiet(boolean quiet) {
		this.quiet = quiet;
	}

	void setActive(boolean active) {
		this.active = active;
	}

	void setLegs(boolean legs) {
		this.legs = legs;
	}

	void setLengthInFeet(int lengthInFeet) {
		this.lengthInFeet = lengthInFeet;
	}

	void setWeightInPounds(double weightInPounds) {
		this.weightInPounds = weightInPounds;
	}

	void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

	void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

	void setBlind(boolean blind) {
		this.blind = blind;
	}

	public void use() {
		System.out.println(type);
		System.out.println(lifeSpan);
		System.out.println(venom);
		System.out.println(reptileFamilies);
		System.out.println(snakeSpecies);
		System.out.println(quiet);
		System.out.println(active);
		System.out.println(legs);
		System.out.println(lengthInFeet);
		System.out.println(weightInPounds);
		System.out.println(favoriteFood);
		System.out.println(homeTown);
		System.out.println(blind);

	}

}
