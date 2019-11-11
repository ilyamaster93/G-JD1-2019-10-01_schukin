package by.academy.java.shchukin.homework.task4.earthmodel;

public class PlanetRunner {

	public static void main(String[] args) {

		Planet earth = new Planet("Earth");

		earth.setMainland(new Mainland("Africa"), new Mainland("Australia"), new Mainland("North America"),
				new Mainland("South America"), new Mainland("Antarctica"), new Mainland("Eurasia"));

		earth.printMainland(earth.getMainland());
		earth.printName();
		earth.mainlandCount(earth.getMainland());
	}
}