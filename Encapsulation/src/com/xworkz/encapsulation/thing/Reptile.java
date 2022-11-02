package com.xworkz.encapsulation.thing;

public class Reptile {

	public static void main(String[] args) {

		Snake snake = new Snake();
		snake.setType("King Cobra");
		snake.setLifeSpan(5);
		snake.setVenom(true);
		snake.setReptileFamilies(20);
		snake.setSnakeSpecies(2000);
		snake.setQuiet(false);
		snake.setActive(true);
		snake.setLegs(false);
		snake.setLengthInFeet(18);
		snake.setWeightInPounds(22.0);
		snake.setFavoriteFood("Mong");
		snake.setHomeTown("North");
		snake.setBlind(false);
		System.out.println("Snake Type:" + snake.getType());
		System.out.println("LifeSpan of Snake:" + snake.getLifeSpan());
		System.out.println("poision:" + snake.getVenom());
		System.out.println("ReptileFamilies:" + snake.getReptileFamilies());
		System.out.println("SnakeSpecies:" + snake.getSnakeSpecies());
		System.out.println("Snake is Quiet:" + snake.getQuiet());
		System.out.println("Snake is Active:" + snake.getActive());
		System.out.println("Snake has legs:" + snake.getLegs());
		System.out.println("Snake length in Feet:" + snake.getLengthInFeet());
		System.out.println("Weight of snake:" + snake.getWeightInPounds());
		System.out.println("FavoriteFood of Snake:" + snake.getFavoriteFood());
		System.out.println("Home Town of Snake:" + snake.getHomeTown());
		System.out.println("Snake is Blind:" + snake.getBlind());
		snake.use();
	}

}
