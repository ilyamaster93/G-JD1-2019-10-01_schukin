package by.academy.java.shchukin.classwork.lessonJDKEight.lessonTwo;

import java.util.function.Supplier;

class Car {
	public static Car create(final Supplier<Car> supplier) {
		return supplier.get();
	}
}

public class Test6 {

	public static void main(String[] args) {
		Supplier<Car> supplier = Car::new;
		final Car car = Car.create(supplier);
	}

}