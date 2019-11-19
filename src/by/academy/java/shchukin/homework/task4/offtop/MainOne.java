package by.academy.java.shchukin.homework.task4.offtop;

public class MainOne {

	public static void main(String[] args) {

		Cat barsik = new Cat("Барсик", 5, 4);
		// String barsikName = barsik.getName();
		int barsikAge = barsik.getAge();
		int barsikWeight = barsik.getWeight();

		System.out.println("Имя кота: " + barsik.getName());
		System.out.println("Возраст кота: " + barsikAge);
		System.out.println("Вес кота: " + barsikWeight);
	}
}
