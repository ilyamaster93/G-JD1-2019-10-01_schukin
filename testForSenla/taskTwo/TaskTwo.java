package by.senla.test.taskTwo;

import java.util.Scanner;

public class TaskTwo {

	public static void main(String[] args) {
		getDescriptionInput();
	}

	public static void getDescriptionInput() {
		int userInputA = scanInt(0, Integer.MAX_VALUE);
		int userInputB = scanInt(0, Integer.MAX_VALUE);
		System.out.println("НОД: " + gcd(userInputA, userInputB) + " НОК: " + lcm(userInputA, userInputB));
	}

	public static int scanInt(int a, int b) {
		Scanner in = new Scanner(System.in);
		int userInput = 0;
			for (int i = 0; i < 3; i++) {
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
			return userInput;
		
	}

	public static int gcd(int a, int b) {
		if (b == 0)
			return Math.abs(a);
		return gcd(b, a % b);
	}

	public static int lcm(int a, int b) {
		return a / gcd(a, b) * b;
	}
}