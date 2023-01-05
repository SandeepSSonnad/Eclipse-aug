package com.xworkz.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class DirectorDTO implements Serializable,Comparable<DirectorDTO>{

	private String film;
	private int profit;
	private double budget;
	private String language;
	private LocalDate date;

	public DirectorDTO() {
		// TODO Auto-generated constructor stub
	}

	public DirectorDTO(String film, int profit, double budget, String language, LocalDate date) {
		super();
		this.film = film;
		this.profit = profit;
		this.budget = budget;
		this.language = language;
		this.date = date;
	}

	@Override
	public String toString() {
		return "DirectorDTO [film=" + film + ", profit=" + profit + ", budget=" + budget + ", language=" + language
				+ ", date=" + date + "]";
	}
	
	@Override
	public int hashCode() {
		System.out.println("Running Hashcode.....");
		return 24;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null) {
			if(obj instanceof DirectorDTO) {
				DirectorDTO dto=(DirectorDTO)obj;
				if(dto.getFilm().equals(this.film)) {
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public int compareTo(DirectorDTO o) {
		
		return this.film.compareTo(o.film);
	}

	public String getFilm() {
		return film;
	}

	public void setFilm(String film) {
		this.film = film;
	}

	public int getProfit() {
		return profit;
	}

	public void setProfit(int profit) {
		this.profit = profit;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
