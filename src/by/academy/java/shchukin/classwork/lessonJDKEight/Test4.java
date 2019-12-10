package by.academy.java.shchukin.classwork.lessonJDKEight;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {
		int multiplier = 4; // тут неявно указан модификатор final
		Arrays.asList(1, 2, 3, 4, 5).forEach(e -> System.out.println(e * multiplier)); // То, что лямбда-функция видит
																						// переменную multiplier,
																						// объявленную не в ней, это
																						// называется замыкание
	}

}
