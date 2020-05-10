package by.senla.test.taskSix;

public class Item {
	private String name;
	private int weight;
	private int value;

	public Item(String name, int weight, int value) {
		this.name = name;
		this.weight = weight;
		this.value = value;
	}

	public double valueUnitOfWeight() {
		return value / (double) weight;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public int getValue() {
		return value;
	}

	public String toString() {
		return "{name:" + name + ";weight:" + weight + ";value:" + value + "}";
	}
}
