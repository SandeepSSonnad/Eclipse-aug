package com.xworkz.abstraction.thing;

public class JavaTrainee extends Person implements XworkzRule {

	public void training() {
		System.out.println("Running Java Trainee");
	}

	public boolean executeProgram() {
		System.out.println("Running executeProgram");
		return true;
	}

	@Override
	public void eat() {
		System.out.println("Eat healthy food");
	}

	@Override
	public void sleep() {

		System.out.println("Sleep Well");
	}

	@Override
	public boolean uploadedTask() {
		System.out.println("EveryBody Upload the Task and Push to GitHub");
		return false;
	}

	@Override
	public boolean completedProgram() {
		System.out.println("Complete the Given task");
		return false;
	}

}
