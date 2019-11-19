package by.academy.java.shchukin.classwork.lesson13;

import java.io.Serializable;

public class Model implements Serializable {

	private String model;

	private Model(String model) {
		super();
		this.model = model;
	}

	private String getModel() {
		return model;
	}

	private void setModel(String model) {
		this.model = model;
	}

}
