package by.academy.java.shchukin.homework.task4.country;

import java.util.ArrayList;
import java.util.List;

import by.academy.java.shchukin.homework.task4.earthmodel.Mainland;

public class Country {
	private String countryName;
	private String capitalName;
	private double countrySquare;
	private int numberOfRegions;
	List<Region> regionsList = new ArrayList<>();
	List<District> districtsList = new ArrayList<>();
	List<City> citiesList = new ArrayList<>();

	public Country(String countryName, String capitalName, double countrySquare, int numberOfRegions) {
		super();
		this.countryName = countryName;
		this.capitalName = capitalName;
		this.countrySquare = countrySquare;
		this.numberOfRegions = numberOfRegions;
	}

	public void printRegions(List<Region> regionsList) {
		for (int i = 0; i < regionsList.size(); i++) {
			System.out.println(regionsList.get(i).getRegionName());
		}
	}

	public void printCountryName() {
		System.out.println(countryName);
	}

	public void printCapitalName() {
		System.out.println(capitalName);
	}

	public void printCountrySquare() {
		System.out.println(countrySquare);
	}

	public int regionsCount(List<Region> regionsList) {
		System.out.println("Count of regions: " + regionsList.size());
		return regionsList.size();
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCapitalName() {
		return capitalName;
	}

	public void setCapitalName(String capitalName) {
		this.capitalName = capitalName;
	}

	public double getCountrySquare() {
		return countrySquare;
	}

	public void setCountrySquare(double countrySquare) {
		this.countrySquare = countrySquare;
	}

	public int getNumberOfRegions() {
		return numberOfRegions;
	}

	public void setNumberOfRegions(int numberOfRegions) {
		this.numberOfRegions = numberOfRegions;
	}

	public List<Region> getRegionsList() {
		return regionsList;
	}

	public void setRegionsList(Region... args) {
		for (int i = 0; i < args.length; i++) {
			this.regionsList.add(args[i]);
		}
	}

	public List<District> getDistrictsList() {
		return districtsList;
	}

	public void setDistrictsList(List<District> districtsList) {
		this.districtsList.add((District) districtsList);
	}

	public List<City> getCitiesList() {
		return citiesList;
	}

	public void setCitiesList(List<City> citiesList) {
		this.citiesList.add((City) citiesList);
	}

}
