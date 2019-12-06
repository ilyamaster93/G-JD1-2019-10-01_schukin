package by.academy.java.shchukin.classwork.lessonJDKEight.lessonTwo;

import java.util.ArrayList;

import java.util.List;
import java.util.function.Consumer;

class CarOne {
	private int fuelVolume;

	public void addFuel(final int volume) { //не статик метод, принадлежит конкретному объекту
		fuelVolume += volume;
	}

	@Override
	public String toString() {
		return "Car [fuelVolume=" + fuelVolume + "]";
	}
}

@FunctionalInterface
interface ConsumerWith2Params<T, O> { //функ интерфейс с 2-мя пар-ми
	void accept(T t, O o);
}

public class MemberMethodReference2 {
	public static void main(String[] args) {
		final List<CarOne> cars = new ArrayList<>();
		cars.add(new CarOne());
		cars.add(new CarOne());

		System.out.println("initial cars state");
		Consumer<? super CarOne> objectPrinter = System.out::println;//метод println выз-ся у конкр-го объекта
		cars.forEach(objectPrinter);

		add30Liters(cars, CarOne::addFuel);//отрываем нестатический метод от класса и после передаем ссылку на нестатический метод класса

		System.out.println("cars after fuel append");

		cars.forEach(objectPrinter);
	}

	public static void add30Liters(List<CarOne> cars, ConsumerWith2Params<CarOne, Integer> consumer) {
		for (CarOne car : cars) {
			consumer.accept(car, 30); //над объектом car вып-ся .addFuel
		}
	}
}