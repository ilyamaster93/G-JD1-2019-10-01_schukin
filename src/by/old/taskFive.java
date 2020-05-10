package by.old;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class taskFive {

	private static String string;
	private static String word;
	private static List<Integer> arrList;
	private static List<Integer> palindromList;
	private static int n;
	private static int counter;

	public static void main(String[] args) {

		System.out.println("Введите число N: ");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for (int i = 0; i <= n; i++) {
			arrList.add(i);
		}

		for (int i = 0; i <= n; i = i + 2) {

		}

		for (int i = 1; i <= n; i = i + 2) {
			// odd
		}

	}

	private static int numberOfRepetitions(String text) {

		int counter = 1;
		StringBuilder sb = new StringBuilder();
		for (String words : arrList) {
			if (words.length() != 0 && counter / 2 != 0) {
				counter++;
				palindromList.add(arrList.get(counter));
			} else if (words.length() != 0 && counter / 2 == 0) {
				counter++;
				palindromList.add(arrList.get(counter));
			}
		}
		return counter;
	}

	public static Boolean isPalindrom(int leftBorder, int rightBorder) {
		while (leftBorder <= rightBorder) {
			if (words[leftBorder] != words[rightBorder]) {
				return false;
			}
			++leftBorder;
			--rightBorder;
		}
		return true;
	}

	public static void operator() {
		for (int leftBorder = 0; leftBorder < words.length(); ++leftBorder) {
			for (int rightBorder = leftBorder + 1; rightBorder < words.length(); ++rightBorder) {
				if (isPalindrom(leftBorder, rightBorder)) {
					palindromList.add(arrList.get(counter));
				}
				counter++;
			}
		}
	}

	private static void oddPalAdd() {
		for (int indMiddle = 0; indMiddle < words.length(); ++indMiddle) {
			int leftBorder = indMiddle - 1, rightBorder = indMiddle + 1;
			while (leftBorder >= 0 && rightBorder < words.length() && words[leftBorder] == words[rightBorder]) {
				++counter;
				--leftBorder;
				++rightBorder;
			}
		}
	}

	private static void evenPalAdd() {
		for (int indMiddle = 0; indMiddle < words.length(); ++indMiddle) {
			int leftBorder = indMiddle, rightBorder = indMiddle + 1;
			while (leftBorder >= 0 && rightBorder < words.length() && words[leftBorder] == words[rightBorder]) {
				++counter;
				--leftBorder;
				++rightBorder;
			}
		}
	}

}
