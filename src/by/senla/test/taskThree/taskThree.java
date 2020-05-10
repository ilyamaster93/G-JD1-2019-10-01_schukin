package by.senla.test.taskThree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class taskThree {

	private static String string;
	private static List<String> sortedList;

	public static void main(String[] args) {

		System.out.println("Введите текст: ");
		Scanner in = new Scanner(System.in);
		string = in.nextLine();
		String[] words = string.split("\\s+");
		sortedList = new ArrayList<String>();
		sortedList = Arrays.asList(words);
		System.out.println("Количество слов в предложении: " + sortedList.size());
		Collections.sort(sortedList);
		System.out.println("Отсортированное предложение: ");
		for (String str : sortedList)
			System.out.print(" " + str);

		System.out.print(doUpperCase(string));
	}

	private static StringBuilder doUpperCase(String text) {

		System.out.println("\n" + "Отсортированное предложение после рефакторинга первых букв:  ");
		StringBuilder sb = new StringBuilder();
		for (String word : sortedList) {
			if (word.length() != 0) {
				sb.append(word.substring(0, 1).toUpperCase() + word.substring(1)).append(" ");
			}
		}
		return sb;
	}

}
