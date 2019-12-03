package by.academy.java.shchukin.classwork.lessonJDKEight;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		Arrays.asList("a", "b", "d").sort((e1, e2) -> e1.compareTo(e2)); // неявный вид, return явно не пишем, т.к. тело
																			// лямбда-функции сост-т из однйо строки

		Arrays.asList("a", "b", "d").sort((e1, e2) -> { // явный вид
			int result = e1.compareTo(e2);
			return result;
		});
	}

}
