package by.academy.java.shchukin.homework.task4.offtop;

public class Cat {

	private String name;
	private int age;
	private int weight;

	public Cat(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public Cat() {
	}

	public void sayMeow() {
		System.out.println("Мяу!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}