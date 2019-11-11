package by.academy.java.shchukin.homework.task4.country;

import java.util.ArrayList;

import java.util.List;

public class City {
	private String cityName;
	private double citySquare;
	private int cityPopulation;
		
	public City(String cityName, double citySquare, int cityPopulation) {
		super();
		this.cityName = cityName;
		this.citySquare = citySquare;
		this.cityPopulation = cityPopulation;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public double getCitySquare() {
		return citySquare;
	}
	public void setCitySquare(double citySquare) {
		this.citySquare = citySquare;
	}
	public int getCityPopulation() {
		return cityPopulation;
	}
	public void setCityPopulation(int cityPopulation) {
		this.cityPopulation = cityPopulation;
	}
	
}
