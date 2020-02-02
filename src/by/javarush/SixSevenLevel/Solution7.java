package by.javarush.SixSevenLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution7 {
	public static void main(String[] args) throws Exception {
		// напишите тут ваш код
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] array = new int[20];

		for (int i = 0; i < array.length; i++) {
			String s = reader.readLine();
			array[i] = Integer.parseInt(s);
		}

		int[] arrayTenOne = new int[10];
		for (int i = 0; i < arrayTenOne.length; i++) {
			arrayTenOne[i] = array[i];
		}
		int[] arrayTenTwo = new int[10];
		for (int i = 0; i < arrayTenTwo.length; i++) {
			arrayTenTwo[i] = array[i + array.length / 2];
		}

		for (int i = 0; i < arrayTenTwo.length; i++)
			System.out.println(arrayTenTwo[i]);
	}
}
