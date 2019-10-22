package by.academy.java.shchukin.classwork.lesson6.inheritance;

public abstract class Car extends Object {
	private String carBrand;
	public abstract void move();
	
	private String getCarBrand() {
	return carBrand;
	}
}
