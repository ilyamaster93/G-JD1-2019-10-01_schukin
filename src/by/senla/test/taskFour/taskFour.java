package by.senla.test.taskFour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class taskFour {

	private static String string;
	private static String word;
	private static List<String> arrList;

	public static void main(String[] args) {

		System.out.println("Введите текст: ");
		Scanner in = new Scanner(System.in);
		string = in.nextLine();
		System.out.println("Введите слово: ");
		word = in.nextLine();
		String[] words = string.split("\\s+");
		arrList = new ArrayList<String>();
		arrList = Arrays.asList(words);

		if ((numberOfRepetitions(string) >= 2) && (numberOfRepetitions(string) <= 4))
			System.out.print("Слово " + word + " употребляется в предложении " + numberOfRepetitions(string) + " раза");
		else if ((numberOfRepetitions(string) == 1) || (numberOfRepetitions(string) >= 5))
			System.out.print("Слово " + word + " употребляется в предложении " + numberOfRepetitions(string) + " раз");
		else
			System.out.print("Слово " + word + " НЕ употребляется в предложении ");

	}

	private static int numberOfRepetitions(String text) {

		int counter = 0;
		StringBuilder sb = new StringBuilder();
		for (String words : arrList) {
			if (words.length() != 0 && words.equalsIgnoreCase(word)) {
				counter++;
			}
		}
		return counter;
	}

}
