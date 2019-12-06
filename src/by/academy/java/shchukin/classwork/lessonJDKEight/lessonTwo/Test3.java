package by.academy.java.shchukin.classwork.lessonJDKEight.lessonTwo;

import java.util.ArrayList;
import java.util.List;

class Car2 {
	public static void destroy(final Car2 car) {
		System.out.println("Destroyed " + car.toString());
	}
}

public class Test3 {

	public static void main(String[] args) {
		final List<Car2> cars = new ArrayList<>();
		cars.forEach(Car2::destroy);

	}

}