package by.academy.java.shchukin.classwork.lesson13;

import java.io.Serializable;

public class CarOne implements Serializable {
	private static final long serialVersionUID = 1L;// версия класса, используемого при сериализации
	private String vin;
	private Model model;
	private transient Brand brand; // transient - чтобы скипнуть свойство

	private CarOne(Brand brand) {
		super();
		this.brand = brand;
	}

	private Brand getBrand() {
		return brand;
	}

	private void setBrand(Brand brand) {
		this.brand = brand;
	}

	private CarOne(Model model) {
		super();
		this.model = model;
	}

	private Model getModel() {
		return model;
	}

	private void setModel(Model model) {
		this.model = model;
	}

	CarOne(String vin) {
		super();
		this.vin = vin;
	}

	private String getVin() {
		return vin;
	}

	private void setVin(String vin) {
		this.vin = vin;
	}

}
