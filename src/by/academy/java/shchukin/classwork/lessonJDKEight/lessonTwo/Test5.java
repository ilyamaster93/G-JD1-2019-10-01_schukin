package by.academy.java.shchukin.classwork.lessonJDKEight.lessonTwo;

import java.util.function.Consumer;

public class Test5 {

	public static void main(String[] args) {
		Consumer<String> printFunction = System.out::print;
		printFunction.accept("Hello world");
	}

}