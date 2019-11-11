package by.academy.java.shchukin.homework.task4.car;

import java.util.ArrayList;
import java.util.List;

public class Car extends SuperCar {

	private List<Wheel> wheelsList;
	private double volume;
	
	private boolean isMove = false;
	private double refuel;
	private String model;

	Car(String model, List<Wheel> wheelsList) {
		this.model = model;
			this.wheelsList = wheelsList;
	}

	public void stop() {
		this.isMove = false;
		System.out.println("Автомобиль остановлен.");
	}

	@Override
	public void move() {
		this.isMove = true;
		System.out.println("Автомобиль едет.");
	}

	@Override
	public void refuel(double liter) {
		if (!isMove) {
			this.refuel = liter;
			System.out.println("Автомоболь заправлен на " + liter);
		} else {
			System.out.println("Остановите автомобиль марки: " + getModel());
		}
	}

	@Override
	public void replaceWheel(int num) {
		if (!isMove && num>=1 && num <=4) {
			System.out.println("Колесо с номером " + num + " заменено.");
		} else {
			System.out.println("Остановите автомобиль марки: " + getModel());
		}
	}

	public String getModel() {
		return this.model;
	}
	
	
}