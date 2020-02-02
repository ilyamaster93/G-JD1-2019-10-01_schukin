package by.javarush.SixSevenLevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution0706 {
	public static void main(String[] args) throws IOException {
		// напишите тут ваш код
		int[] array = initializeArray();
		max(array);
	}

	public static int[] initializeArray() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] array = new int[15];

		for (int i = 0; i < array.length; i++) {
			String s = reader.readLine();
			array[i] = Integer.parseInt(s);
		}
		return array;
	}

	public static void max(int[] array) {
		int evenCount = 0;
		int oddCount = 0;

		for (int i = 1; i < array.length; i = i + 2) {
			evenCount = evenCount + array[i];
		}

		for (int i = 0; i < array.length; i = i + 2) {
			oddCount = oddCount + array[i];
		}
		if (evenCount > oddCount) {
			System.out.println("В домах с нечетными номерами проживает больше жителей.");
		} else
			System.out.println("В домах с четными номерами проживает больше жителей.");
	}
}