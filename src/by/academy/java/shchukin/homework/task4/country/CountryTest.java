package by.academy.java.shchukin.homework.task4.country;

import java.util.ArrayList;
import java.util.List;

import by.academy.java.shchukin.homework.task4.earthmodel.Mainland;

public class CountryTest {

	public static void main(String[] args) {
		Country country = new Country("Belarus", "Minsk", 207600.0, 6);

		country.setRegionsList(new Region("Grodno"), new Region("Minsk"), new Region("Gomel"), new Region("Brest"),
				new Region("Vitebsk"), new Region("Mogilev"));
		country.printRegions(country.getRegionsList());

		country.printCapitalName();
		country.printCountrySquare();
		country.regionsCount(country.getRegionsList());
	}

}
