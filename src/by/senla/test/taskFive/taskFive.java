package by.senla.test.taskFive;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class taskFive {

	private static List<String> arrList = new ArrayList<String>();
	private static List<String> palindromList = new ArrayList<String>();;
	private static char[] strToArray;

	public static void main(String[] args) throws Exception {

		int userInput = scanInt(0, 100);
		for (Integer i = 0; i <= userInput; i++) {
			arrList.add(String.valueOf(i));
		}
		executor();
	}

	public static int scanInt(int a, int b) {
		Scanner in = new Scanner(System.in);
		int userInput;
		while (true) {
			System.out.println("Введите целое число в диапазоне [" + a + " .. " + b + "]: ");
			String s = in.nextLine();
			try {
				userInput = Integer.parseInt(s);
				if (userInput < a || userInput > b)
					System.err.println("Не соответствует условиям ввода!");
				else
					break;
			} catch (NumberFormatException e) {
				System.err.println("Не соответствует условиям ввода!");
			}
		}
		in.close();
		return userInput;
	}

	private static void executor() {

		for (String words : arrList) {
			strToArray = words.toCharArray();
			if (isPalindrom()) {
				palindromList.add(words);
			}
		}
		if (palindromList.isEmpty()) {
			System.out.println("Чисел-палиндромов нет ");
		} else {
			for (String words : palindromList) {
				System.out.println(words);
			}
		}
	}

	public static Boolean isPalindrom() {
		int len = strToArray.length;
		for (int i = 0; i < len / 2; ++i) {
			if (strToArray[i] != strToArray[len - i - 1]) {
				return false;
			}
		}
		return true;
	}

}
