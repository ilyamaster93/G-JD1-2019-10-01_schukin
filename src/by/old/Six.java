package by.old;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Six {

	private static List<String> arrList = new ArrayList<String>();
	private static List<String> palindromList = new ArrayList<String>();;
	private static int counter = 0;
	private static char[] strToArray;

	public static void main(String[] args) throws Exception {

		System.out.println("Введите число N: ");
		Scanner in = new Scanner(System.in);
		Integer n = in.nextInt();
		in.close();
		for (Integer i = 0; i <= n; i++) {
			arrList.add(String.valueOf(i));
		}
		executor();
	}

	private static void executor() {

		for (String words : arrList) {
			strToArray = words.toCharArray();
			operator();
		}
		for (String words : palindromList) {
			System.out.println(words);
		}
	}

	public static Boolean isPalindrom(int leftBorder, int rightBorder) {
		while (leftBorder <= rightBorder) {
			if (strToArray[leftBorder] != strToArray[rightBorder]) {
				return false;
			}
			++leftBorder;
			--rightBorder;
		}
		return true;
	}

	public static void operator() {
		for (int leftBorder = 0; leftBorder < strToArray.length; ++leftBorder) {
			for (int rightBorder = strToArray.length - 1; rightBorder < strToArray.length; --rightBorder) {
				if (isPalindrom(leftBorder, rightBorder)) {
					palindromList.add(arrList.get(counter));
				}
			}
			counter++;
		}
	}

}
