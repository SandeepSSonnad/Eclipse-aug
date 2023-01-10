package com.xworkz.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {

	private String name;
	private int duration;
	private String startingMonth;

	public String getName() {
		return name;
	}

	@Value("Summer")
	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	@Value("3 ")
	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getStartingMonth() {
		return startingMonth;
	}

	@Value("June")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}

}
