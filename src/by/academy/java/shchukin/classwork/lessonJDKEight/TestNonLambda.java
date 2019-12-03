package by.academy.java.shchukin.classwork.lessonJDKEight;

import java.util.Arrays;
import java.util.function.Consumer;

public class TestNonLambda {

	public static void main(String[] args) {
		Arrays.asList("a", "b", "d").forEach(new Consumer<String>() {
			@Override
			public void accept(String e) {
				System.out.println(e);
			}
		});
	}

}
