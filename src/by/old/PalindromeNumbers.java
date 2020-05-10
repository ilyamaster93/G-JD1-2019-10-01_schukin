package by.old;

import java.util.Scanner;

public class PalindromeNumbers {

	private static int n;

	public static void main(String[] args) {

		System.out.println("Введите число N: ");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for (int i = 0; i < n; i++) {
			if (pole(i) != -1)
				System.out.println(pole(i));

		}
	}

	public static int pole(int num) {
		int reverse = 0;
		int n = num;

		for (int i = 0; i <= num; i++) {

			int r = num % 10;
			num = num / 10;
			reverse = reverse * 10 + r;
			i = 0;

			if (n == reverse)
				return n;
			else
				return -1;
		}
	}
}
