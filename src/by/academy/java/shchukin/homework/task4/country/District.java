package by.academy.java.shchukin.homework.task4.country;

import java.util.ArrayList;
import java.util.List;

public class District {
	private String districtName;
	private double districtSquare;
	private int districtPopulation;

	public District(String districtName, double districtSquare, int districtPopulation) {
		super();
		this.districtName = districtName;
		this.districtSquare = districtSquare;
		this.districtPopulation = districtPopulation;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public double getDistrictSquare() {
		return districtSquare;
	}

	public void setDistrictSquare(double districtSquare) {
		this.districtSquare = districtSquare;
	}

	public int getDistrictPopulation() {
		return districtPopulation;
	}

	public void setDistrictPopulation(int districtPopulation) {
		this.districtPopulation = districtPopulation;
	}

}
