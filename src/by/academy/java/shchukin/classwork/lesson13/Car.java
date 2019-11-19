package by.academy.java.shchukin.classwork.lesson13;

import java.io.Serializable;

public class Car implements Serializable {
	private String vin;
	private Model model;
	private transient Brand brand;

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public void setVin(String vin) {
		this.vin = vin;

	}

	@Override
	public String toString() {
		return "Car [vin=" + vin + ", model=" + model + "]";
	}

}