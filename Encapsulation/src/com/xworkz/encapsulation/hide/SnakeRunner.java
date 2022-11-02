package com.xworkz.encapsulation.hide;

import com.xworkz.encapsulation.thing.Snake;

public class SnakeRunner {

	public static void main(String[] args) {
		
		Snake snake=new Snake();
		System.out.println(snake.getType());
		System.out.println(snake.getLifeSpan());
		System.out.println(snake.getVenom());
		System.out.println(snake.getReptileFamilies());
		System.out.println(snake.getSnakeSpecies());
		System.out.println(snake.getQuiet());
		System.out.println(snake.getActive());
		System.out.println(snake.getLegs());
		System.out.println(snake.getLengthInFeet());
		System.out.println(snake.getWeightInPounds());
		System.out.println(snake.getFavoriteFood());
		System.out.println(snake.getHomeTown());
		System.out.println(snake.getBlind());

	}

}
