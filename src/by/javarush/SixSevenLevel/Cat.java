package by.javarush.SixSevenLevel;

import java.util.ArrayList;

public class Cat {
	public static ArrayList<Cat> cats;

	public Cat() {
	}

	public static void main(String[] args) {
		cats = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			cats.add(new Cat());
		}
		printCats();
	}

	public static void printCats() {
		for (int i = 0; i < cats.size(); i++) {
			System.out.println(cats.get(i));
		}
	}
}