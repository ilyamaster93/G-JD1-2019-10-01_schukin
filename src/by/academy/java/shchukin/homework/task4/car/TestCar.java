package by.academy.java.shchukin.homework.task4.car;

import java.util.ArrayList;
import java.util.List;

public class TestCar {

	public static void main(String[] args) {
		String model = "Tesla";
		List<Wheel> wheelsList = new ArrayList<>();
		Car car = new Car(model, wheelsList);
		System.out.println("Модель: " + car.getModel());
		car.move();
		car.stop();
		car.refuel(15);
		car.replaceWheel(1);
		car.move();
	}
}